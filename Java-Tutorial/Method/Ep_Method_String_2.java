
public class Ep_Method_String_2 
{
    public static void main(String[] args) 
    {
        //! replace ---> ("ตัวอักษรที่จะเปลียน คำไหน","ตัวอักษรที่จะเปลียนแทนคำเก่า")
        String text_message = "Hello World";
        System.out.println("replace ---> Before = "+text_message);

        //* replace ("After","Before")
        text_message = text_message.replace("World","James");
        System.out.println("replace ---> After = "+text_message);

            //! replace ---> ("ตัวอักษรที่จะเปลียน คำไหน","ตัวอักษรที่จะเปลียนแทนคำเก่า")

            //? replaceFirst --> คือจะให้เปลียนเฉพาะตัวแรก ตัวหลังจะยังคงเหมือนเดิม 
            //? replace ---> จะคำไหนให้เปลียนทั้งหมด นั้นคือ ความแตกต่าง จาก replaceFirst

            //! replaceFirst ---> คือจะให้เปลียนเฉพาะตัวแรก ส่วนตัวหลัง ยังเหมือนเดิม
                text_message = text_message.replaceFirst("Hello","Wecome");
                System.out.println("replaceFirst --> After = "+text_message);
            //! replaceFirst ---> คือจะให้เปลียนเฉพาะตัวแรก ส่วนตัวหลัง ยังเหมือนเดิม 

                //! split ---> คือการ ตัดข้อความ ใน String และจะส่งค่า กลับเป็น Array
                String Iphone = "Iphone x:Iphone 11 Pro:Iphone 11 Pro Max";
                //? สร้าง ตัวแปล Array ขึ้นมาเพื่อรับค่า split ที่ Return กลับมาเป็น
                //? slite ("เมื่อ slite เจอสัญลักษณ์ ที่เรากำหนดไว้ จะแบ่ง String")
                String [] dataIphone = Iphone.split(":");
                System.out.println("split ---> "+dataIphone[2]);
                //! split ---> คือการ ตัดข้อความ ใน String และจะส่งค่า กลับเป็น Array

                    //! subString(คือการระบุ หมายเลข Index ใน String ที่จะแสดงถึงช่วงไหน และบวก 1 ช่วงหมายเลขสุดท้ายเพราะ -1)
                    String nameman = "LaserOnline";
                    //? substring (เลข Index เริ่มต้น,และ เลข Index สุดท้าย -1)|หรือจะคิดว่าบวก 1 ก็ได้
                    //? หรือถ้าต้องการ ใช้เรียก หมายเลข Index เริ่มต้น ยังถึงสุดท้าย สุด คือไม่ใส่หมายเลข Index สุดท้าย ให้ ใส่ แค่หมายIndex เริ่มต้น
                    //? เช่น (5) หากไม่มีการใส่ Index สุดท้าย subString จะเรียก หมายเลยท้ายสุดใน String ทันที่
                    String word = nameman.substring(5,7); //? 5 คือ O || 7 คือ n
                    //? substring (เลข Index เริ่มต้น,และ เลข Index สุดท้าย -1)|หรือจะคิดว่าบวก 1 ก็ได้
                    System.out.println("subString ---> "+word);
                    //! subString(คือการระบุ หมายเลข Index ใน String ที่จะแสดงถึงช่วงไหน และบวก 1 ช่วงหมายเลขสุดท้ายเพราะ -1)

                        //! toCharArray ---> คือการแปลง String ให้เป็นรูปแบบ Array Character
                        //? toCharArray การแปลง String ให้เป็น Array Char สามาเรียกใช้ แบบ Array ได้
                        String Fname = "James";
                        char [] namearray = Fname.toCharArray();
                        System.out.println("toCharArray ---> "+namearray[2]);
                        //? toCharArray การแปลง String ให้เป็น Array Char สามาเรียกใช้ แบบ Array ได้
                        //! toCharArray ---> คือการแปลง String ให้เป็นรูปแบบ Array Character

                        //! String.copyValuseOf ---> คือการแปลง Array Character ให้เป็น String
                        //? String.copyValuseOf การแปลง รูปแบบนี้ char จะเป็น String
                            char [] nameChar = {'L','a','s','e','r'};    
                            String string = String.copyValueOf(nameChar);
                            System.out.println("String.copyValuseOf ---> "+string);
                        //? String.copyValuseOf การแปลง รูปแบบนี้ char จะเป็น String
                        //! String.copyValuseOf ---> คือการแปลง Array Character ให้เป็น String

                            //! trim ---> คือการตัดคำว่างใน String
                            String tell = "   Tell World Your  ";
                            //? ก่อนใช้ trim
                            System.out.println("Before trim String ---> "+tell.length());
                            System.out.println("Before trim  ---> "+tell);
                            //? ก่อนใช้ trim
                            //? หลังใช้ trim
                            tell = tell.trim();
                            System.out.println("After trim String ---> "+tell.length());
                            System.out.println("After trim String --->  "+tell);
                            //? หลังใช้ trim
                            //! trim ---> คือการตัดคำว่างใน String

                                //! toUpperCase การแปลงตัวพิมพ์เล็กให้เป็นพิมพ์ใหญ่ทั้งหมด
                                String boxtext = "LaserOnline";
                                //? toUpperCase มีหน้าที่แปลง ตัวอักษร พิมพ์เล็กให้กลายเป็นพิมพ์ใหญ่
                                boxtext = boxtext.toUpperCase();
                                System.out.println("toUpperCase ---> "+boxtext);
                                //? toUpperCase มีหน้าที่แปลง ตัวอักษร พิมพ์เล็กให้กลายเป็นพิมพ์ใหญ่
                                //! toUpperCase การแปลงตัวพิมพ์เล็กให้เป็นพิมพ์ใหญ่ทั้งหมด

                                //! toLowerCase คือการ แปลงตัวอักษร ที่เป็นพิมพ์ใหญ่ ให้เป็นพิมพ์เล็ก
                                String boxtext2 = "LaserOnline";
                                //? toLowerCase มีหน้าที่ แปลงตัวอักษร พิมพ์ใหญ่ เป็นเป็นพิมพ์เล็ก
                                boxtext2 = boxtext2.toLowerCase();
                                //? toLowerCase มีหน้าที่ แปลงตัวอักษร พิมพ์ใหญ่ เป็นเป็นพิมพ์เล็ก
                                System.out.println("toLowerCase ---> "+boxtext);
                                //! toLowerCase คือการ แปลงตัวอักษร ที่เป็นพิมพ์ใหญ่ ให้เป็นพิมพ์เล็ก

                                //! valueOf ---> คือการ แปลง ข้อมูล ชนิด Integer ให้เป็น String 
                                int number = 100;
                                //? valueOf ---> สามารถแปลงเป็นชนิด ข้อมูลอื่นๆๆ ได้ โดยการเปลียน ชื่อ ชนิดข้อมูล
                                String numberstring = String.valueOf(number);
                                //? valueOf ---> สามารถแปลงเป็นชนิด ข้อมูลอื่นๆๆ ได้ โดยการเปลียน ชื่อ ชนิดข้อมูล
                                System.out.println("valueOf ---> "+numberstring);
                                //! valueOf ---> คือการ แปลง ข้อมูล ชนิด Integer ให้เป็น String 

    }    
}
