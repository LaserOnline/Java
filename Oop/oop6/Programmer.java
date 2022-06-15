class Programmer extends Employee {
    
   public void skill (){
        System.out.println("No skill");
   }

    public void skill(String...language){
            for(int i = 0; i < language.length; i++){
                System.out.println(language[i]);
            }
    }

    public void  Bonus(){
        System.out.println("Programmer Bonus = 20%: ");
    }

}
