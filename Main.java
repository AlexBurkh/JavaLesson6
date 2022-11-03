import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task();
    }

    static void Task() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(LaptopManufacturer.lenovo,
                "t480s", LaptopColor.black,
                new LaptopScreen(14, LaptopScreenMatrixType.ips, LaptopScreenResolution.fullHD, 4),
                "AVC123", "Intel core i7 8700", "Windows 10", 16, 1000, 2,
                false, 50000));
        laptops.add(new Laptop(LaptopManufacturer.asus,
                "rog", LaptopColor.black,
                new LaptopScreen(17, LaptopScreenMatrixType.ips, LaptopScreenResolution._4k, 1),
                "AVCB123", "Intel core i7 9700", "Windows 10", 32, 1000, 3,
                false, 100000));
        laptops.add(new Laptop(LaptopManufacturer.acer,
                "apacer", LaptopColor.black,
                new LaptopScreen(15.6, LaptopScreenMatrixType.tn, LaptopScreenResolution.fullHD, 8),
                "AVCBD123", "Intel core i3 4500", "Windows 7", 4, 500, 5,
                true, 20000));


        Map<Integer, String> params = new HashMap<>();
        params.put(1, "Объем ОЗУ");
        params.put(2, "Диагональ экрана");
        params.put(3, "Цена");
        params.put(4, "Объем накопителя");

        Map<Integer, Integer> userParams = AskParameters(params);
        List<Laptop> filteredLaptops = filterLaptops(userParams, laptops);
        for (int i = 0; i < filteredLaptops.size(); i++) {
            System.out.println(filteredLaptops.get(i));
        }
    }

    private static List<Laptop> filterLaptops(Map<Integer, Integer> userParams, Set<Laptop> laptops) {
        List<Laptop> result = new ArrayList<>();
        for (Laptop l : laptops) {
            boolean flag= true;
            if (userParams.containsKey(1)) {
                if (l.getRamGb() < userParams.get(1)) {
                    flag = false;
                }
            }
            if (userParams.containsKey(2)) {
                if (l.getScreen().getDiagonal() < userParams.get(2)) {
                    flag = false;
                }
            }
            if (userParams.containsKey(3)) {
                if (l.getPrice() > userParams.get(3)) {
                    flag = false;
                }
            }
            if (userParams.containsKey(4)) {
                if (l.getStorageGb() < userParams.get(4)) {
                    flag = false;
                }
            }
            if (flag == true) {
                result.add(l);
            }
        }
        return result;
    }
    static Map<Integer, Integer> AskParameters(Map<Integer, String> params) {
        System.out.println("Введите номер(а) параметра(ов) для фильтрации (через пробел):\n" +
                "1. " + params.get(1) + "\n" +
                "2. " + params.get(2) + "\n" +
                "3. " + params.get(3) + "\n" +
                "4. " + params.get(4));
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();
        var userParams = processUserInput(userAnswer.split(" "));
        Map<Integer, Integer> userParamMeanings = new HashMap<>();
        for (Integer i : userParams) {
            System.out.println("Введите минимальное значение параметра " + params.get(i) + ": ");
            String mean = sc.nextLine();
            int meanInt = Integer.parseInt(mean);
            userParamMeanings.put(i, meanInt);
        }
        return userParamMeanings;
    }
    static private List<Integer> processUserInput(String[] params) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < params.length; i++) {
            try {
                res.add(Integer.parseInt(params[i]));
            }
            catch (Exception ex) {
                continue;
            }
        }
        return res;
    }
}