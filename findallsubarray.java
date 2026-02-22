public class findallsubarray{
    public static void main(String[] args){
         int[] arr = {1, 2, 3};

         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
         }
    }
}

/*  List<List<Integer>> list = new ArrayList<>();

for(int i = 0; i < arr.length; i++){
    for(int j = i; j < arr.length; j++){
        List<Integer> temp = new ArrayList<>();
        for(int k = i; k <= j; k++){
            temp.add(arr[k]);
        }
        list.add(temp);
    }
}

System.out.println(list);*/