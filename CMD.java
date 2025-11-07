public class CMD{
   public static void main(String[] args){

      if(args.length == 2){
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);

         System.out.println("Addition is:"+(a+b));
      }else
         System.out.println("Input Must Be Only 2 Numbers");
   }
}