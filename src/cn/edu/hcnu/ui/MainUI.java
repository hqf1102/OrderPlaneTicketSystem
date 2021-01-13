package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.Impl.IFlightServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("按1，录入航班信息:");
            System.out.println("按2，显示所有的航班信息:");
            System.out.println("按3，查询航班信息:");
            System.out.println("按4，机票预定：");
            System.out.println("按5，机票退订：");
            System.out.println("按6，退出系统：");
            int choice = scanner.nextInt();
            if (choice == 1) {
                String uuid = UUID.randomUUID().toString();
                String id = uuid.replace("-", "");
                System.out.println("UUID=" + id);
                System.out.println("输入航班编号：");
                String flight_id = scanner.next();

                System.out.println("请输入飞机型号：");
                String aircraftModel = scanner.next();

                System.out.println("请输入座位数：");
                int currentSeats = scanner.nextInt();

                System.out.println("请输入出发机场：");
                String departureAirport = scanner.next();

                System.out.println("请输入目的机场：");
                String destinationAirport = scanner.next();
                System.out.println("出发时间：");
                String departureTime = scanner.next();
                Flight flight = new Flight(id, flight_id, currentSeats, aircraftModel, departureTime, departureAirport, destinationAirport);
                IFlightService iFlightService = new IFlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String erromassage = e.getMessage();
                    if(erromassage.startsWith("ORA-12899")){
                        //按指定的模式查找字符串（正则表达式规则）
                     /* String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";*/
                      //ORA-12899: 列 "ROOT"."FLIGHT"."ID" 的值太大 (实际值: 32, 最大值: 30)
                       //String pattern="(\\w+-\\d{5}):(\\s.\\s)(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        String pattern="\\.(\"\\w+\")\\.(\"\\w+\")";
                        //创建Pattern对象
                        Pattern pr=Pattern.compile(pattern);
                        //创建mather对象
                        Matcher matcher=pr.matcher(erromassage);
                        if(matcher.find()){
                            String tableName= matcher.group(1);
                            String columnName=matcher.group(2);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大请仔细检查！");
                        }


                    }

                }

            }else if (choice==2){
                IFlightService iFlightService = new IFlightServiceImpl();
                Set<Flight> flightSet= null;
                try {
                    flightSet = iFlightService.getAllFlights();
                    for (Flight flight:flightSet){
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }


        }

    }
}
