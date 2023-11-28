import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Tugas5 {
    public static void main(String[] args) {
        String data[][] = {{"Andi", "11119", "1"},
                {"Bima", "11112", "1"},
                {"Rahma", "11131", "3"},
                {"Zeno", "11198", "9"},
                {"Rahma", "11131", "3"},
                {"Andi", "11119", "1"}};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data_mahasiswa.txt"));

            Set<String> uniqueData = new HashSet<>();

            for (int i = 0; i < data.length; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < data[i].length; j++) {
                    row.append(data[i][j]).append("\t");
                }
                uniqueData.add(row.toString());
            }

            for (String row : uniqueData) {
                writer.write(row);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}