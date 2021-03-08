import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");

        String data = in.nextLine();

        System.out.println();

        print(data);

        in.close();
    }

    public static void print(String data) {
        for(int i = 0 ; i < data.length() ; i++){
            if(data.charAt(i) == '1'){
                System.out.println("1111"+"\n  11"+"\n  11"+"\n  11"+"\n  11");
            }else if(data.charAt(i) == '2'){
                System.out.println("2222"+"\n   2"+"\n  2"+"\n 2"+"\n2222");
            }else if(data.charAt(i) == '3'){
                System.out.println("3333"+"\n   3"+"\n3333"+"\n   3"+"\n3333");
            }else if(data.charAt(i) == '4'){
                System.out.println("  4"+"\n 44"+"\n4 4"+"\n4444"+"\n  4");
            }else if(data.charAt(i) == '5'){
                System.out.println("5555"+"\n5"+"\n5555"+"\n   5"+"\n5555");
            }else if(data.charAt(i) == '6'){
                System.out.println("6666"+"\n6"+"\n6666"+"\n6  6"+"\n6666");
            }else if(data.charAt(i) == '7'){
                System.out.println("7777"+"\n  7"+"\n  7"+"\n 7"+"\n7");
            }else if(data.charAt(i) == '8'){
                System.out.println("8888"+"\n8  8"+"\n8888"+"\n8  8"+"\n8888");
            }else if(data.charAt(i) == '9'){
                System.out.println("9999"+"\n9  9"+"\n9999"+"\n   9"+"\n9999");
            }else if(data.charAt(i) == '0'){
                System.out.println("0000"+"\n0  0"+"\n0  0"+"\n0  0"+"\n0000");
            }
            System.out.println();
        }


    }
}
