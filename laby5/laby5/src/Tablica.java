import java.lang.Math;

public class Tablica {
    private int[] tab;

    Tablica(int size){
        tab = new int[size];
    }
    public void fill(int start, int end){
        for (int i = 0; i<tab.length; i++){
            tab[i] = (int)(Math.random()*(end-start))+start;
        }
    }

    public void show(){
        for(int num : tab){
            System.out.print(num);
            System.out.print("  ");
        }
        System.out.println();

    }

    public void reverse(){
        int size = tab.length;
        for (int i = 0; i<(int)(size/2); i++){
            int tmp = tab[size-i-1];
            tab[size-i-1] = tab[i];
            tab[i] = tmp;
        }
    }

    public int find(int number){
        int index = -1;
        int i = 0;
        while(i<tab.length && tab[i]!=number){
            i++;
        }
        if (i<tab.length){
            index = i;
        }
        return index;
    }

    public void showMaxMin(){
        System.out.println("Maximum: "+tab[getMin()]+" index: " + getMin());
        System.out.println("Minimum: "+tab[getMax()]+" index: " + getMax());
    }

    public int getMin(){
        int minindex = 0;

        for (int i = 0; i<tab.length; i++){
            if (tab[i]<tab[minindex]){
                minindex = i;
            }
        }
        return minindex;
    }
    public int getMax(){
        int minindex = 0;

        for (int i = 0; i<tab.length; i++){
            if (tab[i]>tab[minindex]){
                minindex = i;
            }
        }
        return minindex;
    }

    public boolean roznowartosciowa(){
        for (int i = 0; i<tab.length-1; i++){
            for (int j = i+1; j<tab.length; j++){
                if (tab[i]==tab[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void makeRoznowartosciowa(){
        int[] new_tab;
        int min = tab[getMin()]-1;
        int new_tab_lenght = 0;
        for (int i= 0; i<tab.length; i++){
            if(isOneValueInTab(tab[i])){
                new_tab_lenght++;
            }else{
                tab[i] = min;
            }
        }
        new_tab = new int[new_tab_lenght];
        int new_index = 0;
        for (int i= 0; i<tab.length; i++){
            if(tab[i]!=min){
                new_tab[new_index] = tab[i];
                new_index++;
            }
        }
        tab = new_tab.clone();

    }

    public boolean isOneValueInTab(int value){
        int number = 0;
        for (int num:tab){
            if (num==value){
                number++;
            }
        }
        return number==1?true:false;
    }


}
