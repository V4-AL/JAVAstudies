public  class TwoDimensionsalArray {
    public static void main(String[]args){
        int[][] K = {{2,3,4},{5,6,7},{8,9,1}};
        int[][] J = {{3,4,5},{7,8,9},{2,1,3}};

        int a = K[0][0];
        for(int y=1; y<K.length;y++) {
            for(int x=1; x<K[y].length;x++) {
                if(x==y) {
                    a *= K[y][x];
                }
            }
        }
        System.out.println("Product of leading diagonal of Matrix K is: "+ a);

        //Trailing diagonal of Matrix K 
        int b = K[0][2];
        for(int y=1; y<J.length;y++) {
            for(int x=0; x<K[y].length-1;x++) {
                if(x+y==K.length-1) {
                    b*= K[y][x];
                }
            }
        }
        System.out.println("Product of trailing diagonal of Matrix K is: "+ b);
        
        //Leading diagonal of Matrix J
        int c= J[0][0];
        for(int y=1; y<J.length;y++) {
            for(int x=1; x<J[y].length;x++) {
                if(x==y) {
                    c *= J[y][x];
                }
            }

        }
        System.out.println("Product of leading diagonal of Matrix J is: " + c);

        int d = J[0][2];
        for(int y=1; y<K.length;y++) {
            for(int x=1; x<J[y].length;x++) {
                if(x+y==J.length-1) {
                    d*= J[y][x];
                }
            }
        }
        System.out.println("Product of trailing diagonal of Matrix K is: "+ d);

    }
}

//Submit to his email : kftwumi@gmail.com
