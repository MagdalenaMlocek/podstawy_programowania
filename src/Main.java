public class Main {
            public static void main(String[] args) {
                int liczba = 5;
                int liczba2;
                liczba2 = 2;
//                System.out.println("Hello word" + liczba);
//
//
//                System.out.println(liczba % liczba2);
//
//                String name = " Magda";
//                int age = 25;
//                System.out.println("My name is" + name + " and I have " + age + " years old." );


                String account = "Magda Mlocek";
                account.length();
                System.out.println(account.length());

                System.out.println(account.indexOf('r'));
                System.out.println(account.substring(1,6));
                System.out.println(account.trim());
                System.out.println(account.length());

                char a = 'a';
                char alpha = '\u03B1';
                System.out.println(alpha);

                char[] witaj = {'w','i','t','a','j'};
                System.out.println(witaj);
                Character.isDigit(a);
                System.out.println( Character.isDigit(a));

                if(liczba>liczba2 | liczba2==liczba){
                    System.out.println("SystemDziala");
                }else {
                    System.out.println("SystemNieDziala");
                    if (liczba==liczba2){
                        System.out.println("SystemDziala1");
                    }
                }

    }



}

