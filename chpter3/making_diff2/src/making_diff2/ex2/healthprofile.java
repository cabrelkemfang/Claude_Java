/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making_diff2.ex2;

/**
 *
 * @author Claude
 */
public class healthprofile {
       private
            String first_name;
            String last_name;
            char gender;
            int month;
            int day;
            int year;
            int weight,height;
    public
            healthprofile(String first_name,String last_name,char gender,int month,int day,int year,int w,int h){
                this.first_name = first_name;
                this.last_name = last_name;
                this.gender = gender;
                this.month = month;
                this.day = day;
                this.year = year;
                this.weight = w;
                this.height = h;
            }
    public void setname(String first_name){
  this.first_name = first_name;
  }
  public String getname(){
 return first_name;
  }
   public void setlastname(String last_name){
  this.last_name = last_name;
  }
  public String getlastname(){
 return last_name;

  }
  public void setgender(char gender){
      this.gender = gender;
  }
  public char getgender(){
      return gender;
  }
    void setmonth(int m){
            month = m;
            }
            int getmonth(){
            return month;    
            }
             void setday(int d){
            day = d;
            }
            int getday(){
            return day;    
            } 
            void setyear(int y){
            year = y;
            }
            int getyear(){
            return year;    
            }
             void Displaydate(){
                System.out.printf("%d / %d / %d%n", month,day,year);
            }
               public int age(){
        int age = 2018 - this.year;
                return age;
        
}     
    public int maxheartRate(){
       return 220 - this.age();
    }
         public float target(){
             return ((50 * this.maxheartRate())/100);
         }   
    public float BMI(){
                float ans = (this.weight / (this.height * this.height));
        return ans;
    } 
}
