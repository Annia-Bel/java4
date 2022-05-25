public static void main(String[] args) {
        task1();
        task2();
        }

private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
        "Tea", "Home", "Omega",
        "Sugar", "Beta", "Horse",
        "Dog", "Cat", "Java",
        "Yava", "Kent", "Tea",
        "Dog", "Beta", "Horse",
        "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
        if (hm.containsKey(words[i]))
        hm.put(words[i], hm.get(words[i]) + 1);
        else
        hm.put(words[i], 1);
        }
        System.out.println(hm);
        }

private static void task2() {
        Directory directory = new Directory();

        directory.add("belov", "8999123321");
        directory.add("belov", "8912155326");
        directory.add("Buridze", "8917155552");
        directory.add("buridze", "8913455672");
        directory.add("antonyan", "899999999");
        directory.add("igoryan", "899111111");
        directory.add("belov", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("Vasya", "8324325234");

        System.out.println(directory.get("belov"));
        System.out.println(directory.get("Vasya"));
        System.out.println(directory.get("buridze"));
        System.out.println(directory.get("smetanov"));
        }
        }

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
