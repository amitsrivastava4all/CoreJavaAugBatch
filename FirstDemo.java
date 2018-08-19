class SecondDemo{
    public static void main(String args[]){
        if(args.length==2){
        int firstNumber = Integer.parseInt(args[0]) ;
        int secondNumber = Integer.parseInt(args[1]);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is  "+sum);
        }
        else{
            System.out.println("Invalid Arguments Need 2 Arguments");
        }
    }

}