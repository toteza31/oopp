
package projectoop;
import java.util.Scanner;
public class ProJectOop extends ChooseMenu{  
    static String exit;
    public static void main(String[] args) {
       
        open o = new open();
        o.Title();
    
        ChooseMenu c = new  ChooseMenu();
        do{
            System.out.println("##################### ");
       
        c.ShowMenu();
        c.CHOOSE();
        
         LastTotalPoint+=(want*point);
         LastTotalPrice+=(want*price1);
        
        Scanner strr = new Scanner(System.in);
            System.out.print("Do you Exit (y/Y) >> ");
            exit = strr.nextLine();
         i++;
               
        }while(!exit.equals("y") && !exit.equals("Y"));
       
         c.Cheackpoint();
   
         Bill BB = new Bill();
         BB.Sent();
         BB.bill();
    }
 
}
    abstract class LOGIN{
        public abstract void Title();
        public abstract void Login();
        public abstract void printbill();
    }
    
    class open extends LOGIN {
    
    static String member;
    
    public String name[] ={"login1","login2"};
    public String pass[] ={"1234","123"};
    private String password,username;
   
    Scanner str = new Scanner(System.in); // String
    Scanner in = new Scanner(System.in); // int
    
    public void Title(){
        
        System.out.println("=======================================");  
        System.out.println("     Welcom to login Shoping only"); 
        System.out.println("======================================="); 
      
        ChooseMenu m = new ChooseMenu();
        m.Haveuser();
      }
    
    public  void Login(){
       int p=0;
        do {         
            System.out.print("Username: ");
            username = str.nextLine();
         System.out.print("password: ");
            password = str.nextLine();
            
         if((username.equals(name[0])&& password.equals(pass[0])) || (username.equals(name[1])&&password.equals(pass[1]))){
          
             while(p==0){
           System.out.println("<<<<<<<<< Login success >>>>>>>>>");
           System.out.println("---------------------------------");
             p++;   }
             
    }else{        
              System.out.println("<<<<<<<  Please try again >>>>>>");
           }
        }while(!((username.equals(name[0]) && password.equals(pass[0])) || (username.equals(name[1])&&password.equals( pass[1]))));
}
   
    public void printbill(){}
  } 

 class ChooseMenu {  
    
     static int choose,choose1,choose2,want,sent;                 //Choose
     static int price1,point;                                     //set value
     static int total1=0,total2=0,total3=0;                       //total
     private int y=10;
     
     static String member;
     
     static String showall[] = new String [999]; 
     static String a[] = new String[999];
     
     static int  LastTotalPoint=0,LastTotalPrice=0;               //total all
     static int  i = 0;
     
     ChooseMenu(){ }
     
     ChooseMenu(int r){
        
          System.out.println("1.refrigerator");
          System.out.println("2.fan");
          System.out.println("3.iron");
          System.out.println("4.television"); 
          System.out.println("################");
         
     }
     public void Haveuser(){
      
         Scanner str = new Scanner(System.in);
         System.out.print("Do you have member? (Y/N) >> ");
         member = str.nextLine();
        
        open o = new open();
        switch(member){
           
            case "Y": case "y":     o.Login(); break;    
            case "N": case "n":              ; break;
            default : o.Title() ;              break ;
              } 
     }
     
     public void ShowMenu(){
     
      System.out.println("1.Electronics");
      System.out.println("2.Kitchenware");
      System.out.println("3.Furniture");
      System.out.println("################");
     }
     
     public void CHOOSE(){
     Scanner in = new Scanner(System.in);
     
     System.out.print("what is you choose >>>");
        choose = in.nextInt();
       
          switch(choose){
          case  1  :    Electronics e = new Electronics()  ;break;  
          case  2  :    Kitchenware k = new Kitchenware(8)  ;break;
          case  3  :    Furniture   f = new Furniture()    ;break;
          default : CHOOSE()    ;break;
        }
  }
     
     public void chooseMenuPrint(){  
        Scanner tote = new Scanner(System.in);
        System.out.print("You choose >>> ");
        choose2 = tote.nextInt();
        
        switch(choose2){
            case 1 :case 2:case 3: break;
            default:chooseMenuPrint();break;
        }
     }
     public void How(){
         Scanner strr = new Scanner(System.in);
            System.out.print("How many do you want >> ");
            want = strr.nextInt();
     }
     
     public int you(int y){
       y = this.y;   
     return y;
     }
     
      public void Cheackpoint(){
            System.out.println("If you have point "+you(999)+ " sale "+you(999)+" %");
     }
 
        public void printlast1(){
            int u = 1;
             total1=want*price1;
             showall[i]="< "+want+" > "+a[i]+(total1) + " Bath";
             System.out.println("--------------------------------");
             System.out.println( showall[i]);
             System.out.println("Point is "+(want*point) + " point");
             System.out.println("--------------------------------");
           }
 } 
interface Eletronic2{
    
    public void Refrigerator();
    public void Fan();
    public void Iron();
    public void Television();
}

class Electronics extends ChooseMenu implements Eletronic2{    

    Electronics(){      
          
          super(5);
          numberneed();
    }
          public void numberneed(){
          Scanner str = new Scanner(System.in);
          System.out.print("what number are you need >> ");
             choose1 = str.nextInt();
      
             switch(choose1){
          
              case 1 : Refrigerator() ;break;
              case 2 : Fan()          ;break;
              case 3 : Iron()         ;break;
              case 4 : Television()   ;break;
              default: numberneed() ;break;
           }
        }
        
          public void print(){
          super.chooseMenuPrint();
         
          if(choose1 ==1 && choose2 == 1 ){     price1= 12000;
              a[i]= "PANASONIC : 59.8 x 65 x 175.5 CM "; }
          else if(choose1 ==1 && choose2 == 2){ price1=8500;
              a[i]="TEKA : 55 x 50.6 x 78 CM ";}
          else if(choose1 ==1 && choose2 == 3){price1 =10000;
              a[i]="SMEG : 90.66 x 69 x 177 CM " ;}
          else if(choose1 ==2 && choose2 == 1){price1 = 1100;
              a[i]="MITSUBISHI : 37.4 x 30.5 x 61 CM ";}
          else if(choose1 ==2 && choose2 == 2){ price1 = 1000;
               a[i]="HATARI : 37.4 x 30.5 x 61 CM : Black "; }
          else if(choose1 ==2 && choose2 == 3){price1 = 950;
               a[i]="CLARTE : 37.4 x 30.5 x 61 CM : Red "; }
          else if(choose1 ==3 && choose2 == 1){price1 = 1400;
               a[i]="Philips : 2400W : Blue  ";  }
          else if(choose1 ==3 && choose2 == 2){price1 = 550;
               a[i]="TEFAL : 1,200W : Red " ;  }
          else if(choose1 ==3 && choose2 == 3){price1 = 750;
               a[i]="SHARP : AM-P200.R : Black ";   }
          else if(choose1 ==4 && choose2 == 1){price1 = 25000;
              a[i]="LG UHD TV \"55\" "  ; }
          else if(choose1 ==4 && choose2 == 2){price1 = 15000;
               a[i]="Aconatic LED HDTV \"40\" "; }
          else if(choose1 ==4 && choose2 == 3){ price1 = 12000;
               a[i]="TCL QUHD LED Smart TV \"32\" "; }
          else {  System.out.println("#######Again please#######");
           Electronics aa = new Electronics( );}
          
          System.out.println("--------------------------------");  
          System.out.println(a[i]+" "+price1+" Bath");
          System.out.println("Point is "+point); 
          
          super.How();
          super.printlast1(); 
          }
          
    public  void  Refrigerator(){
        point = 7 ;
      System.out.println("1.PANASONIC : 59.8 x 65 x 175.5 CM");
      System.out.println("2.TEKA      : 55 x 50.6 x 78    CM");
      System.out.println("3.SMEG      : 90.66 x 69 x 177  CM");   
      print();
      }
    public  void  Fan(){ 
        point = 5 ; 
      System.out.println("1.MITSUBISHI : 37.4 x 30.5 x 61 CM : Blue    ");
      System.out.println("2.HATARI     : 37.4 x 30.5 x 61 CM : Black  ");
      System.out.println("3.CLARTE     : 37.4 x 30.5 x 61 CM : Red    ");
       print();
    }
    public  void  Iron(){
        point = 4 ;
      System.out.println("1.Philips : 2400W     : Blue  ");
      System.out.println("2.TEFAL   : 1,200W    : Red");
      System.out.println("3.SHARP   : AM-P200.R : Black");
       print();
    }
    public  void  Television(){
        point = 7;
      System.out.println("1.LG UHD TV             \"55\" ");
      System.out.println("2.Aconatic LED HDTV     \"40\" ");
      System.out.println("3.TCL QUHD LED Smart TV \"32\" ");
       print();
    }
}
interface Kitchenware1{
public void Pot(); 
public void Pan(); 
public void Dish();
public void Knife();
}
   class Kitchenware extends ChooseMenu implements Kitchenware1{
       
       Kitchenware(){    
        System.out.println("1.Pot");
        System.out.println("2.Fan");
        System.out.println("3.Dish");
        System.out.println("4.Gas Stove");
        System.out.println("################");
        numberneed();      
       }
     public void numberneed(){        
      Scanner str = new Scanner(System.in);
          System.out.print("what number are you need >> ");
             choose1 = str.nextInt();
     
             switch(choose1){        
              case 1 : Pot()          ;break;
              case 2 : Pan()          ;break;
              case 3 : Dish()         ;break;
              case 4 : Knife()        ;break;
              default: numberneed() ;break;
           }  
        
       }
           Kitchenware(int u){
           this();
           }
           public void print(){   
               super.chooseMenuPrint();
               
          if(choose1 ==1 && choose2 == 1){     price1 = 450;
              a[i]="24CM./8QT. STOCKPOT WITH SS LID ";}
          else if(choose1 ==1 && choose2 == 2){price1 = 400;
              a[i]="16CM./8QT. STOCKPOT WITH SS LID ";}
          else if(choose1 ==1 && choose2 == 3){price1 = 350;
               a[i]="12CM./8QT. STOCKPOT WITH SS LID ";}
          else if(choose1 ==2 && choose2 == 1){price1 = 550;
               a[i]="Tefal 20 cm. "      ;}
          else if(choose1 ==2 && choose2 == 2){price1 = 450;
               a[i]="Dmall-Wobao 20 cm. ";}
          else if(choose1 ==2 && choose2 == 3){price1 =350;
               a[i]="Tefal 10 cm. "   ;}
          else if(choose1 ==3 && choose2 == 1){ price1 = 450;
              a[i]="Size: 21 cm : 12 dishes "; }
          else if(choose1 ==3 && choose2 == 2){ price1 = 400;
               a[i]="Size: 18 cm : 12 dishes ";}
          else if(choose1 ==3 && choose2 == 3){ price1 = 250;
               a[i]="Size: 12 cm : 12 dishes ";  }
          else if(choose1 ==4 && choose2 == 1){  price1 = 240 ;
               a[i]="Rhino Brand 8 inch ";   }
          else if(choose1 ==4 && choose2 == 2){ price1 = 170;
               a[i]="Rhino Brand 5 inch ";  }
          else if(choose1 ==4 && choose2 == 3){ price1 = 90;
               a[i]="Rhino Brand 3 inch ";   }
          else {  System.out.println("#######Again please#######");
           Kitchenware kk = new Kitchenware();
          }
          
          System.out.println(a[i]+" "+price1+" Bath");
          System.out.println("Point is "+point);     
           super.How();
           super.printlast1();
           
          }    
       public void Pot(){
           point  = 2 ;
           System.out.println("1.24CM./8QT. STOCKPOT WITH SS LID"); 
           System.out.println("2.16CM./8QT. STOCKPOT WITH SS LID"); 
           System.out.println("3.12CM./8QT. STOCKPOT WITH SS LID");  
              print();
       }
       public void Pan(){
           point = 2;
           System.out.println("1.Tefal 20 cm."); 
           System.out.println("2.Dmall-Wobao 20 cm.");
           System.out.println("3.Tefal 10 cm.");  
              print();
       }
       public void Dish(){
           point = 2;
           System.out.println("1.Size: 21 cm : 12 dishes");
           System.out.println("2.Size: 18 cm : 12 dishes");
           System.out.println("3.Size: 12 cm : 12 dishes");  
              print();
       }
       public void Knife(){
           point = 1;
           System.out.println("1.Rhino Brand 8 inch");
           System.out.println("2.Rhino Brand 5 inch");
           System.out.println("3.Rhino Brand 3 inch");  
              print();
       }
   }
interface Furniture1 {
   public void Table();
   public void Sofa();
   public void Lockers();
   public void Chair();
}
class Furniture extends ChooseMenu implements Furniture1 {
    Furniture(){
        
        System.out.println("1.Table");
        System.out.println("2.Sofa");
        System.out.println("3.Lockers");
        System.out.println("4.Chair");
        System.out.println("################");
        numberneed();
    }
    public void numberneed(){
         Scanner str = new Scanner(System.in);
          System.out.print("what number are you need >> ");
            choose1 = str.nextInt();
          switch(choose1){
          
              case 1 : Table()         ;break;
              case 2 : Sofa()          ;break;
              case 3 : Lockers()      ;break;
              case 4 : Chair()         ;break;
              default: numberneed()   ;break;
         }  
      }
 
    public void print(){ 
        
           super.chooseMenuPrint();
           
           if(choose1 ==1 && choose2 == 1){    price1 =  3500 ;
             a[i]="CAMERICH : Wood : Gray Oak : 150 x 40 x 72 CM ";}
          else if(choose1 ==1 && choose2 == 2){price1 =  3300 ;
              a[i]="LIFESTYLE : Metal,Mirror: Glass : 120 X 70 X 40 CM ";}
          else if(choose1 ==1 && choose2 == 3){price1 =  3250 ;
               a[i]="ASHLEY : Metal, Pinewood : Brown : 127 x 40 x 82 CM ";}
          else if(choose1 ==2 && choose2 == 1){price1 =  5500 ;
             a[i]="LIFESTYLE : Cloth, Wood : Orange "        ;}
          else if(choose1 ==2 && choose2 == 2){price1 =  4500 ;
            a[i]="LIFESTYLE : Cloth, Leather, Steel : Brown ";}
          else if(choose1 ==2 && choose2 == 3){price1 =  3500 ;
             a[i]="LIFESTYLE : Wood : Black "                 ;}
          else if(choose1 ==3 && choose2 == 1){price1 =  3520 ;
             a[i]="METAL PRO : Grey White : 2 : 460x600x716 " ;}
          else if(choose1 ==3 && choose2 == 2){price1 =  2560 ;
               a[i]="METAL PRO : Grey White : 3 : 464x616x1020 ";}
          else if(choose1 ==3 && choose2 == 3){price1 =  2350;
              a[i]="METAL PRO : Grey White : 4 : 464x616x1320 ";}
          else if(choose1 ==4 && choose2 == 1){price1 =  1500 ;
               a[i]="LIFESTYLE : 49 x 52.5 x 80.5 CM : Green "  ;}
          else if(choose1 ==4 && choose2 == 2){price1 =  1300 ;
              a[i]="CAMERICH  : 45 x 54 x 81 CM : Black "      ;}
          else if(choose1 ==4 && choose2 == 3){price1 =  1200 ;
               a[i]="LIFESTYLE : 45 x 47 x 82 CM : White "      ;}
          else {  System.out.println("#######Again please#######");
           Furniture ff = new  Furniture();
          }
           
           System.out.println(a[i]+" "+price1+" Bath");
           System.out.println("Point is "+point); 
          
           super.How();
           super.printlast1();
           
          }
          
   public void Table(){
       point = 5;
           System.out.println("1.CAMERICH  : Wood   : Gray Oak  : 150 x 40 x 72 CM");
           System.out.println("2.LIFESTYLE : Mirror : Glass     : 120 X 70 X 40 CM");
           System.out.println("3.ASHLEY    : Metal  : Brown     : 127 x 40 x 82 CM");
           print();
   }
   public void Sofa(){
       point = 7;
           System.out.println("1.LIFESTYLE : Cloth, Wood : Orange ");
           System.out.println("2.LIFESTYLE : Cloth, Leather, Steel : Brown");
           System.out.println("3.LIFESTYLE : Wood : Black");
           print();
   }
   public void Lockers(){
       point = 7;
           System.out.println("1.METAL PRO : Grey White : 2 : 460x600x716");
           System.out.println("2.METAL PRO : Grey White : 3 : 464x616x1020");
           System.out.println("3.METAL PRO : Grey White : 4 : 464x616x1320");
           print();
   }
   public void Chair(){
       point = 6;
           System.out.println("1.LIFESTYLE : 49 x 52.5 x 80.5 CM : Green");
           System.out.println("2.CAMERICH  : 45 x 54 x 81 CM : Black");
           System.out.println("3.LIFESTYLE : 45 x 47 x 82 CM : White");
           print();
   }
}
class Bill extends ChooseMenu{
private int you =10;
    public void Sent(){
      Scanner str =new Scanner(System.in);
            
      total1=want*price1;
         System.out.println("--------------------------------");
         System.out.println("How do you Sent or Get here ? ");
         System.out.println("1.Sent to       ||| +150 bath|||");
         System.out.println("2.Get here      ||| Free |||");
         System.out.print("Choose >> ");
         
         sent = str.nextInt();
      
           if(sent == 1){    
            System.out.println(" delivery charge + 150 bath");   
           }else if(sent == 2){ 
               System.out.println(" address");
               System.out.println(" \"PSU\" Prince of Songkla University, Phuket Campus");
               
           }else{ Sent(); }
          }
    
   public void bill(){
       int yy;
       finals s = new finals();
       s.printbill();
     
       for( yy = 0 ; yy<i; yy++){
           System.out.println( showall[yy]);  
          
       }
       System.out.println("  Total point >>       "+LastTotalPoint+"\tpoint");
       System.out.println("  Total price >>       "+LastTotalPrice + "\tbath");
       System.out.println("------------------------------------------");
       if(LastTotalPoint>=10){ 
               System.out.println("########## sale 10% ##########");
               System.out.println("  Sale 10% is >>"+tenpersen()+" \tBath");   
               LastTotalPrice-=tenpersen();              
               System.out.println("  Total is >> "+LastTotalPrice+" \tBath");
       }else{ 
              
               System.out.println("########## not sale ##########");
               System.out.println("Total is >> "+LastTotalPrice+" Bath");             
               LastTotalPrice +=0;
           }    
           open oo = new open();          
           if(member.equals("y")){
               
           System.out.println("--------------------------------------------");
           System.out.println("You is member sale 5%");
           System.out.println("  Sale 5% is >>"+fivepersen()+" \tBath");  
           LastTotalPrice-=fivepersen()  ;
           System.out.println("  Total is >> "+(LastTotalPrice)+" \tBath");
           
       }else{
           System.out.println("--------------------------------------------");
           System.out.println("You isn't member ");
           LastTotalPrice+=0;
            }
               System.out.println("-------------------------------------------");
               System.out.println(" You choose to send.       ");
        
        if(sent == 1){
               System.out.println(" ------delivery charge + 150 bath------");   
               System.out.println(" Account number : Krung Thai Bank : ||123-456789|| ");
               LastTotalPrice+=150;
               System.out.println(" Total Price "+(LastTotalPrice) +" Bath");
          
        }else if(sent == 2){ 
            
               System.out.println(" ------delivery charge Free------");
               System.out.println("\"PSU\" Prince of Songkla University, Phuket Campus");
               System.out.println(" Total Price "+LastTotalPrice +" Bath");
           }
        
               System.out.println("---------------- Thank you ----------------");
               System.out.println("===========================================");
       
    }
   public int tenpersen(){
 
    total2=(LastTotalPrice*10)/100; 
         total3=LastTotalPrice-total2; 
   
   return total2;   
   }
   public int fivepersen(){
    int total4=0;
           total4=(LastTotalPrice*5)/100;
   return total4;
   }
}
abstract class PrintBill extends LOGIN{
  public void printbill(){
       System.out.println("====================Bill====================");   
  }
}
class finals extends PrintBill{
  public void Login(){}
  public void Title(){}
  public void printbill(){
       System.out.println("============================================");
       System.out.println("====================Bill====================");
       System.out.println("============================================"); 
       System.out.println("                Shoping only "); 
  }
} 