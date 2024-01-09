import java.util.Scanner;

class  myhotel{
    public static void main(String[] args) {
        int choice,ch1,total=0;
        char ans;
        String Item_or="";
Scanner sc=new Scanner(System.in);

System.out.println("Welcome to TestWay Hotel");

do
{
System.out.println("1: Starters\n2: Main Course\n3: Deserts\n4:Drink");
choice=sc.nextInt();
switch(choice)
{

case 1:

System.out.println("Starters:");
System.out.println("1:masala papad 30rs");

System.out.println("2:paneer chilli 100rs");

System.out.println("3: Maggie 70rs"); 

System.out.println("4:soyabeen chilli 100rs");

ch1=sc.nextInt();
switch(ch1){
    case 1:
        total=total+30;
        Item_or=Item_or+"masala papad";
    break;
    case 2:
        total=total+100;
        Item_or=Item_or+"paneer chili";
    break;
    case 3:
        total=total+100;
        Item_or=Item_or+"pasta";
    break;
    case 4:
        total=total+120;
        Item_or=Item_or+"soyabeen chili";
    break;
   default:
   System.out.println("wrong input");

    
}

break;

case 2:

System.out.println("Maain course:");

System.out.println("1:butter panner 200rs ");
System.out.println("2: butter chicken 200rs");

System.out.println("3:mix veg 150rs");

System.out.println("4:biryani 250rs.");
ch1=sc.nextInt();
switch(ch1){
    case 1:
        total=total+200;
        Item_or=Item_or+"butter paneer";
    break;
    case 2:
        total=total+200;
        Item_or=Item_or+"butter chicken";
    break;
    case 3:
        total=total+150;
        Item_or=Item_or+"mix veg";
    break;
    case 4:
        total=total+250;
        Item_or=Item_or+"biryani";
    break;
   default:
   System.out.println("wrong input");

    
}
break;

case 3:
System.out.println("Dessert:");
System.out.println("1:icecream 50rs ");
System.out.println("2: cupcakes 50rs");

System.out.println("3:brownies 50rs");

System.out.println("4:puddings 50rs.");
ch1=sc.nextInt();
switch(ch1){
    case 1:
        total=total+50;
        Item_or=Item_or+"ice cream";
    break;
    case 2:
        total=total+50;
        Item_or=Item_or+"cupcakes";
    break;
    case 3:
        total=total+50;
        Item_or=Item_or+"brownies";
    break;
    case 4:
        total=total+50;
        Item_or=Item_or+"cakes";
    break;
   default:
   System.out.println("wrong input");

    
}
break;
case 4:
    System.out.println("Drinks:");
System.out.println("1:cold coffee 50rs ");
System.out.println("2: cocktail 40rs");

System.out.println("3:mocktail 70rs");

System.out.println("4:mojito 50rs.");
ch1=sc.nextInt();
switch(ch1){
    case 1:
        total=total+50;
        Item_or=Item_or+"cold coffee";
    break;
    case 2:
        total=total+40;
        Item_or=Item_or+"cocktail";
    break;
    case 3:
        total=total+70;
        Item_or=Item_or+"mocktail";
    break;
    case 4:
        total=total+50;
        Item_or=Item_or+"mojito";
    break;
   default:
   System.out.println("wrong input");
   
break;
}

System.out.println("do yo want to any other item? Y/N");
ans=sc.next().charAt(0);
}
while(ans=='Y' || ans=='y');

        System.out.println("Bill:");
        System.out.println("The order item are:"+Item_or);
        System.out.println("total amount:"+total);
        System.out.println("Thanks for coming\nvisit again:");
    

    }
          }
