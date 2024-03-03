class Set {
    private double[] numbers;

    public Set() {
        this.numbers = new double[0];
        removeDuplicate();
        sortNumber();
    }

    public Set(double[] numbers) {
        this.numbers = numbers;
        removeDuplicate();
        sortNumber();
    }

    public Set(int[] numbers) {
        double[] tempset = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tempset[i] = numbers[i];
        }
        this.numbers = tempset;
        removeDuplicate();
        sortNumber();
    }

    private void sortNumber() {
        for (int i = 0; i < numbers.length; i++) {
            int ind = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[ind] > numbers[j]) {
                    ind = j;
                }
            }
            double temp = numbers[i];
            numbers[i] = numbers[ind];
            numbers[ind] = temp;
        }
    }

    private void removeDuplicate() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -50) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == -50) {
                    continue;
                }
                if (numbers[j] == numbers[i]) {
                    numbers[j] = -50;
                    count++;
                }
            }
        }
        if (count > 0) {
            double[] temp = new double[numbers.length - count];
            int indcount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= -30) {
                    temp[indcount] = numbers[i];
                    indcount++;
                }
            }
            this.numbers = temp;
        }
    }

    public int length() {
        return numbers.length;
    }

    public boolean belongsTo(Set numbers) {
        if (this.numbers.length <= numbers.length()) {
            for (int i = 0; i < this.numbers.length; i++) {
                boolean isok = false;
                for (int j = 0; j < numbers.length(); j++) {
                    if (numbers.getValueInArray()[j] == this.numbers[i]) {
                        isok = true;
                        break;
                    }
                }
                if (!isok) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Set union(Set numbers) {
        double[] tempdub = new double[numbers.length() + this.numbers.length];
        int count = 0;
        for (int i = 0; i < length(); i++) {
            tempdub[count] = this.numbers[i];
            count++;
        }
        for (int i = 0; i < numbers.length(); i++) {
            tempdub[count] = numbers.getValueInArray()[i];
            count++;
        }
        Set tempnumbers = new Set(tempdub);
        return tempnumbers;
    }

    public Set intersect(Set numbers) {
        double[] temp = new double[numbers.length() + this.numbers.length];
        int count = 0;
        for (int i = 0; i < length(); i++) {
            temp[count] = this.numbers[i];
            count++;
        }
        for (int i = 0; i < numbers.length(); i++) {
            temp[count] = numbers.getValueInArray()[i];
            count++;
        }

        count = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            return new Set();
        }
        double[] tempinter = new double[count];
        int ind = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    tempinter[ind] = temp[i];
                    ind++;
                    break;
                }
            }
        }
        Set tempnumbers = new Set(tempinter);
        return tempnumbers;
    }

    public Set differ(Set numbers) {
        int count = 0;
        for (int i = 0; i < this.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (this.numbers[i] == numbers.getValueInArray()[j]) {
                    count++;
                }
            }
        }
        double[] tempdub = new double[length() - count];
        int ind = 0;
        for (int i = 0; i < this.length(); i++) {
            boolean NoOk = true;
            for (int j = 0; j < numbers.length(); j++) {
                if (this.numbers[i] == numbers.getValueInArray()[j]) {
                    NoOk = false;
                    break;
                }
            }
            if (NoOk) {
                tempdub[ind] = this.numbers[i];
                ind++;
            }
        }
        Set tempset = new Set(tempdub);
        return tempset;
    }

    public double[] getValueInArray() {
        return numbers;
    }

    public boolean equals(Set numbers) {
        if (length() == numbers.length()) {
            this.sortNumber();
            numbers.sortNumber();
            for (int i = 0; i < length(); i++) {
                if (this.numbers[i] != numbers.getValueInArray()[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String getStringValue() {
        String text = "{";
        if (this.length() > 0) {
            text += this.numbers[0];
            for (int i = 1; i < this.length(); i++) {
                text += ", " + this.numbers[i];
            }
        }
        text += "}";
        return text;
    }

    public void print() {
        System.out.println(getStringValue());
    }

    public static double sumAllNumberInSet(Set set) {
        double sum = 0;
        for (int i = 0; i < set.length(); i++) {
            sum += set.getValueInArray()[i];
        }
        return sum;
    }
}

public class CSC102_Set_Theory {

    public static void main(String[] args) {
        System.out.println("Set 1");
        System.out.println("===========");
        Set set1 = new Set();
        set1.print();
        System.out.println("");

        System.out.println("Set 2");
        System.out.println("===========");
        Set set2 = new Set(new int[] { 8, 1, 2, 3, 5, 5, 7, 8, 8, 8, 9 });
        set2.print();
        System.out.println(set2.length());
        System.out.println("");

        System.out.println("Set 3");
        System.out.println("===========");
        Set set3 = new Set(new int[] { 8, 7, 7, 6, 5, 1, -30 });
        set3.print();
        System.out.println(set3.length());
        System.out.println("");

        System.out.println("Set 4");
        System.out.println("===========");
        Set set4 = new Set(new int[] { 9, 4 });
        set4.print();
        System.out.println(set4.length());
        System.out.println("");

        System.out.println("Set 5");
        System.out.println("===========");
        Set set5 = set2.intersect(set3);
        set5.print();
        System.out.println(set5.length());
        System.out.println("");

        System.out.println("Set 6");
        System.out.println("===========");
        Set set6 = set2.union(set5);
        set6.print();
        System.out.println("");

        System.out.println("Set 7");
        System.out.println("===========");
        Set set7 = new Set();
        set7 = set7.union(set2).union(new Set(new int[] { 20, 45, 80, 100, 50 }));
        set7.print();
        System.out.println("");

        System.out.println("Set 8");
        System.out.println("===========");
        Set set8 = new Set();
        set8 = set8.union(set1).union(set1).union(set1).union(set1);
        set8.print();
        System.out.println("");

        System.out.println("Set 9");
        System.out.println("===========");
        Set set9 = new Set();
        set9 = set7.differ(set5);
        set9.print();
        System.out.println("");

        System.out.println("Set 10");
        System.out.println("===========");
        Set set10 = new Set();
        set10 = set1.differ(set1.union(set2));
        set10 = set10.differ(set10).union(set3);
        set10.print();
        System.out.println("");

        System.out.println("Set 11");
        System.out.println("===========");
        Set set11 = new Set();
        set11 = new Set(new int[] { 4, 9 }).differ(set5).union(set4);
        set11.print();
        System.out.println("Is Set11 equivalent to Set1 ? ==> " + (set11.equals(set1) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set2 ? ==> " + (set11.equals(set2) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set3 ? ==> " + (set11.equals(set3) ? "Yes" : "No"));
        System.out.println("Is Set11 equivalent to Set4 ? ==> " + (set11.equals(set4) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 12");
        System.out.println("===========");
        Set set12 = new Set();
        set12 = new Set(new int[] {});
        set12.print();
        System.out.println("Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(new Set()) ? "Yes" : "No"));
        System.out.println(
                "Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(new Set(new int[] {})) ? "Yes" : "No"));
        System.out.println("Is Set12 equivalent to Empty Set ? ==> " + (set12.equals(set1) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 13");
        System.out.println("===========");
        Set set13 = new Set();
        set13 = new Set(new int[] { 5, 6, 7 });
        set13.print();
        System.out.println("Do {5, 6, 7} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        set13 = new Set(new int[] { 5, 7, 8 });
        System.out.println("Do {5, 7, 8} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        set13 = new Set(new int[] { 1, 2, 5, 98 });
        System.out.println("Do {1, 2, 5, 98} belong to Set 10 ? ==> " + (set13.belongsTo(set10) ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Set 14");
        System.out.println("===========");
        System.out.println(
                "Empty Set U {2,5,6,7} ==> " + new Set().union(new Set(new int[] { 2, 5, 6, 7 })).getStringValue());
        System.out.println(
                "{2,5,6,7} U Empty Set ==> " + new Set(new int[] { 2, 5, 6, 7 }).union(new Set()).getStringValue());
        System.out.println("");

        System.out.println("Set 15");
        System.out.println("===========");
        System.out
                .println("{} - {2,5,6,7} ==> " + new Set().differ(new Set(new int[] { 2, 5, 6, 7 })).getStringValue());
        System.out
                .println("{2,5,6,7} - {} ==> " + new Set(new int[] { 2, 5, 6, 7 }).differ(new Set()).getStringValue());
        System.out.println("");

        System.out.println("Set 16");
        System.out.println("===========");
        set1.union(set2).union(set3).union(set4).union(set5).union(set6).intersect(set1).print();
        System.out.println("");

        System.out.println("Set 17");
        System.out.println("===========");
        System.out.println("Summation of all numbers in ((Set2 - Set2) - Set1) U Set5 equals "
                + Set.sumAllNumberInSet(set2.differ(set2).differ(set1).union(set5)));
        System.out.println("");

        System.out.println("Set 18");
        System.out.println("===========");
        Set set18 = new Set(
                new double[] { Math.log(10), Math.pow(2.5, 2.5), Math.cos(14), Math.PI, Math.asin(0.5), Math.tan(20) });
        set18.print();
        System.out.println("");

        System.out.println("Set 19");
        System.out.println("===========");
        Set set19 = new Set(new double[] { 125d, 168.366666, 14D, 0.2, 1, 3f, 25L, 54f, 010 });
        set19.print();
        System.out.println("");

        System.out.println("Set 20");
        System.out.println("===========");
        Set set20 = new Set(new double[] { 0x4, 0x1, 25L, 011 }).intersect(set10);
        set20.print();
        System.out.println("");
    }
}