public class MainApplication {


    public class Main {
        public static void main(String[] args) throws Exception {
            User[] users = new User[10];

            users[0] = new User("Иванов", "Иван", "Иванович", 1980, "ivan@example.com");
            users[1] = new User("Петров", "Петр", "Петрович", 1975, "petr@example.com");
            users[2] = new User("Сидоров", "Сидор", "Сидорович", 1992, "sidor@example.com");
            users[3] = new User("Козлова", "Ксения", "Андреевна", 1985, "ksenia@example.com");
            users[4] = new User("Новиков", "Николай", "Николаевич", 1970, "nikolai@example.com");
            users[5] = new User("Григорьева", "Галина", "Сергеевна", 1988, "galina@example.com");
            users[6] = new User("Александров", "Александр", "Александрович", 1995, "alex@example.com");
            users[7] = new User("Ольгина", "Ольга", "Игоревна", 1968, "olga@example.com");
            users[8] = new User("Дмитриев", "Дмитрий", "Дмитриевич", 1978, "dmitriy@example.com");
            users[9] = new User("Мариянова", "Мария", "Александровна", 1990, "maria@example.com");
            for (User user : users) {
                if (user != null && user.getBirthYear() < 1984) {
                    user.printUserInfo();
                    System.out.println();
                }
            }

        }
    }
}
