public class FileUtil {
    public void upperCaseConversion(Path fileReader, Path fileWriter) {
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()));
             BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileWriter.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                fileWrite.write(str.toUpperCase());
                fileWrite.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getRowListt(Path fileReader) {
        List<String> rowList = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                rowList.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    public List<String> getListWordsFirstVowell(Path fileReader) {
        List<String> list = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                Arrays.stream(str.split("(\\W+)"))
                        .filter(i -> i.substring(0, 1).matches("(?i:[aeiouy])"))
                        .forEach(list::add);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
