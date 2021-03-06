import java.util.*;
import static java.util.Calendar.*; //静态导入Calendar类的静态常量
public class Example9_16 {
   public static void main(String args[]) {
      Date nowDate = new Date();
      Date dateADSecond = new Date(1000);
      System.out.println("当前时间:"+nowDate);
      System.out.println("公元（计算机系统）后一秒:"+dateADSecond);
      Calendar calendar=Calendar.getInstance();   
      calendar.setTime(new Date());       
      int  年=calendar.get(YEAR),
           月=calendar.get(MONTH)+1,
           日=calendar.get(DAY_OF_MONTH),
           星期=calendar.get(DAY_OF_WEEK);
      int hour=calendar.get(HOUR_OF_DAY),
          minute=calendar.get(MINUTE),
          second=calendar.get(SECOND);
      System.out.print("现在的时间是：");
      System.out.print(""+年+"年"+月+"月"+日+"日 "+ xingqi(星期));
      System.out.println(" "+hour+"时"+minute+"分"+second+"秒");
      int year=1945,month=8,day=15;       
      calendar.set(year,month-1,day);  //将日历翻到1945年8月15日,注意7表示八月
      System.out.print(year+"年"+month+"月"+day+"日与");
      long time2=calendar.getTimeInMillis();
      year=1931;
      month=9;
      day=18;
      calendar.set(year,month-1,day);  //将日历翻到1931年9月18日
      System.out.print(year+"年"+month+"月"+day+"日");
      long time1=calendar.getTimeInMillis();
      long 相隔天数=(time2-time1)/(1000*60*60*24);
      System.out.println("相隔"+相隔天数+"天");
  }  
  static String xingqi(int n) {
      switch(n) {
       case 1 : return "星期日";
       case 2 : return "星期一";
       case 3 : return "星期二";
       case 4 : return "星期三";
       case 5 : return "星期四";
       case 6 : return "星期五";
       case 7 : return "星期六";
       default : return "";
     }
  }
}






