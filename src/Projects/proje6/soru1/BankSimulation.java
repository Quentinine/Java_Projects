package Projects.proje6.soru1;

import java.util.*;

public class BankSimulation {
    Map<Integer, Customer> customers;
    List<Account> accounts;
    Scanner scanner;

    public BankSimulation() {
        customers = new HashMap<>();
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BankSimulation simulation = new BankSimulation();
        simulation.run();
    }

    public void run() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n----- BANKA İŞLEMLERİ -----");
            System.out.println("1. Müşteri Listele");
            System.out.println("2. Yeni Müşteri Ekle");
            System.out.println("3. Müşteri İşlemleri");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Boşluk temizleme

                switch (choice) {
                    case 1:
                        listCustomers();
                        break;
                    case 2:
                        addCustomer();
                        break;
                    case 3:
                        customerOperationsMenu();
                        break;
                    case 0:
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim! Tekrar deneyin.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hata: Lütfen sadece sayısal giriş yapınız!");
                scanner.nextLine();
            }
        }
    }

    public void listCustomers() {
        System.out.println("\n----- MÜŞTERİLER -----");
        if (customers.isEmpty()) {
            System.out.println("Kayıtlı müşteri bulunmamaktadır.");
        } else {
            for (Customer customer : customers.values()) {
                System.out.println(customer.getCustomerId() + " - " +
                        customer.getFirstName() + " " +
                        customer.getLastName() + " (" +
                        customer.getCity() + ")");
            }
        }
    }

    public void addCustomer() {
        System.out.println("\n----- YENİ MÜŞTERİ EKLE -----");
        System.out.print("İsim: ");
        String firstName = scanner.nextLine();
        System.out.print("Soyisim: ");
        String lastName = scanner.nextLine();
        System.out.print("Şehir: ");
        String city = scanner.nextLine();

        int customerId = customers.size() + 1;
        Customer newCustomer = new Customer(customerId, firstName, lastName, city);
        customers.put(customerId, newCustomer);

        System.out.println("Müşteri başarıyla eklendi. Müşteri ID: " + customerId);
    }

    public void customerOperationsMenu() {
        int customerId;
        do {
            System.out.println("\n----- MÜŞTERİ İŞLEMLERİ -----");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Müşteri ID girin (0 çıkış yapar): ");
            customerId = scanner.nextInt();
            scanner.nextLine();

            if (customerId != 0) {
                Customer customer = customers.get(customerId);
                if (customer != null) {
                    customerOperations(customer);
                } else {
                    System.out.println("Geçersiz Müşteri ID. Tekrar deneyin.");
                }
            }
        } while (customerId != 0);
    }

    public void customerOperations(Customer customer) {
        int choice;
        do {
            System.out.println("\n----- " + customer.getFirstName() + " " + customer.getLastName() + " İŞLEMLERİ -----");
            System.out.println("1. Yeni Hesap Aç");
            System.out.println("2. Hesapları Listele");
            System.out.println("3. Para Yatır");
            System.out.println("4. Para Çek");
            System.out.println("5. Bakiye Sorgula");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Seçiminizi yapın: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    openNewAccount(customer);
                    break;
                case 2:
                    listCustomerAccounts(customer);
                    break;
                case 3:
                    depositToAccount(customer);
                    break;
                case 4:
                    withdrawToAccount(customer);
                    break;
                case 5:
                    checkBalance(customer);
                    break;
                case 0:
                    System.out.println("Ana menüye dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (choice != 0);
    }

    public void openNewAccount(Customer customer) {
        System.out.println("\n----- YENİ HESAP AÇ -----");
        System.out.println("Hesap Türü Seçin (1: Vadesiz, 2: Tasarruf, 3: Kredi): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        AccountType type;
        switch (typeChoice) {
            case 1:
                type = AccountType.CHECKING;
                break;
            case 2:
                type = AccountType.SAVINGS;
                break;
            case 3:
                type = AccountType.CREDIT;
                break;
            default:
                System.out.println("Geçersiz seçim! İşlem iptal edildi.");
                return;
        }

        int accountId = accounts.size() + 1001;
        Account newAccount = new Account(accountId, customer.getCustomerId(), type);
        accounts.add(newAccount);

        System.out.println("Hesap başarıyla açıldı. Hesap Numarası: " + accountId);
    }

    public void depositToAccount(Customer customer) {
        System.out.print("Para yatırmak istediğiniz Hesap ID girin: ");
        int accId = scanner.nextInt();
        scanner.nextLine();

        Account account = getAccountById(accId);


        if (account != null && account.getCustomerId() == customer.getCustomerId()) {
            System.out.print("Yatırılacak tutar: ");
            double miktar = scanner.nextDouble();
            scanner.nextLine();

            account.depositToAmount(miktar);
        } else {
            System.out.println("Geçersiz Hesap ID veya bu hesap size ait değil!");
        }
    }

    public void withdrawToAccount(Customer customer) {
        System.out.print("Para çekmek istediğiniz Hesap ID girin: ");
        int accId = scanner.nextInt();
        scanner.nextLine();

        Account account = getAccountById(accId);

        if (account != null && account.getCustomerId() == customer.getCustomerId()) {
            System.out.print("Çekilecek tutar: ");
            double miktar = scanner.nextDouble();
            scanner.nextLine();

            account.withdrawToAmount(miktar);
        } else {
            System.out.println("Geçersiz Hesap ID veya bakiye yetersiz!");
        }
    }

    public void checkBalance(Customer customer) {
        System.out.print("Bakiyesini görmek istediğiniz Hesap ID girin: ");
        int accId = scanner.nextInt();
        scanner.nextLine();

        Account account = getAccountById(accId);

        if (account != null && account.getCustomerId() == customer.getCustomerId()) {
            // toString() metodunu burada kullanmış oluyoruz
            System.out.println(account.toString());
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void listCustomerAccounts(Customer customer) {
        System.out.println("\n--- " + customer.getFirstName() + " Adına Kayıtlı Hesaplar ---");
        boolean hesapVarMi = false;
        for (Account acc : accounts) {
            if (acc.getCustomerId() == customer.getCustomerId()) {
                System.out.println(acc); // Account'taki toString() çalışır
                hesapVarMi = true;
            }
        }
        if (!hesapVarMi) System.out.println("Henüz bir hesabınız yok.");
    }

    public Account getAccountById(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }
}

