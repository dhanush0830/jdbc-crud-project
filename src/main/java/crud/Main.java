package crud;

import java.util.Scanner;

interface Operation {
    void execute();
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao = new EmployeeDAO();

        try {

            while (true) {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Create Table");
                System.out.println("2. Insert");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Read");
                System.out.println("6. Drop Table");
                System.out.println("7. Exit");

                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();

                Operation op;

                switch (choice) {

                case 1:

                    op = () -> dao.createTable();

                    op.execute();

                    break;

                case 2:

                    op = () -> {

                        try {

                            System.out.print("Enter Emp No : ");
                            int empno = sc.nextInt();

                            System.out.print("Enter Emp Name : ");
                            String empname = sc.next();

                            dao.insertRecord(empno, empname);

                        } catch (Exception e) {

                            System.out.println("Insert Error : " + e.getMessage());
                        }
                    };

                    op.execute();

                    break;

                case 3:

                    op = () -> {

                        try {

                            System.out.print("Enter Emp No : ");
                            int empno = sc.nextInt();

                            System.out.print("Enter New Name : ");
                            String empname = sc.next();

                            dao.updateRecord(empno, empname);

                        } catch (Exception e) {

                            System.out.println("Update Error : " + e.getMessage());
                        }
                    };

                    op.execute();

                    break;

                case 4:

                    op = () -> {

                        try {

                            System.out.print("Enter Emp No : ");
                            int empno = sc.nextInt();

                            dao.deleteRecord(empno);

                        } catch (Exception e) {

                            System.out.println("Delete Error : " + e.getMessage());
                        }
                    };

                    op.execute();

                    break;

                case 5:

                    op = () -> {

                        try {

                            dao.readRecord();

                        } catch (Exception e) {

                            System.out.println("Read Error : " + e.getMessage());
                        }
                    };

                    op.execute();

                    break;

                case 6:

                    op = () -> {

                        try {

                            dao.dropTable();

                        } catch (Exception e) {

                            System.out.println("Drop Error : " + e.getMessage());
                        }
                    };

                    op.execute();

                    break;

                case 7:

                    op = () -> {

                        System.out.println("Program Exited");

                        sc.close();

                        System.exit(0);
                    };

                    op.execute();

                    break;

                default:

                    System.out.println("Invalid Choice");
                }
            }

        } catch (Exception e) {

            System.out.println("Main Error : " + e.getMessage());
        }
    }
}