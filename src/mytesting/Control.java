package mytesting;

public class Control {

    SortTesting gui ;
    String input = gui.getInput();
    public static String output="";
    public int[] getArray() {
        String s = input;
        String[] list1 = new String[s.length() / 2 + 1];
        int[] intList = new int[s.length() / 2 + 1];
        list1 = s.split(",");
        int j = 0;
        for (String i : list1) {
            intList[j] = Integer.valueOf(i);
            j++;
        }

        return intList;
    }

    public void setOutputText(int[] outputArray) {
//        String output = "";
        for (int i : outputArray) {
            this.output += i;
        }
    }
}
