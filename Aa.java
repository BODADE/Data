class A
{
	
   public static void main(String args[])
   {
        String s="HelloJava";

        String small="";
        String big="";

        int c=s.length();
        int k=3,i=0;

       for(i=0; i<k;  i++)
       {
       
                // System.out.println(s.substring(0,3));

        	      small=small+s.charAt(i);
        	     // ++i;


        

    }

        
        System.out.println(""+small);

        for(i=k; i;  i--)
       {
              // System.out.
       	//);println(s.substring(0,3)
                if(i>3){
       	
        	      big=big+s.charAt(i);
        	  }
        	     // ++i;


        
        
    }
    System.out.println(""+big);





    /*     for(int i=0;  i<c;  i++)
         {
               if(i<k)
               {
                     small=s.charAt(i);

               }


         }
         System.out.println(""+small);*/



   }


}