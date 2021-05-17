/*$ java Rotate 0 a,b,c
a
b
c
$ java Rotate 1 a,b,c --> b,c,a
b
c
a
*/

class rotate {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("give 2 arguments");

        }

        else{
            int n = Integer.valueOf(args[0]);

            String[] arr = args[1].split(",");

            for(int i = n;i<arr.length;i++){
                System.out.println(arr[i]);
            }

            for(int i = 0; i<n;i++){
                System.out.println(arr[i]);
            }


        }

    }
}