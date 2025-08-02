public class date {
    private int year;
    private int month;
    private int day;
    // prvate int year , month , day ;

    //constructer (Method that same name of class)
    public date(int year,int month,int day){
        this.year = year ;
        this.month = month ;
        this.day = day ;
    }

    //Setter and Getter Method
    //Setter = กำหนดค่าให้กับตัวแปร
    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    //Getter = ส่งค่าคืนกลับไปที่ Object
    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day ;
    }
    //toString = method ที่เรียกใช้ได้เลยผ่าน object
    public String toString(){
        return "Date is "+String.format("%02d%02d%4d",month,day,year);
    }

    public void setDate(int year , int month , int day){
        this.year = year ;
        this.month = month;
        this.day = day;
    }

}
    
