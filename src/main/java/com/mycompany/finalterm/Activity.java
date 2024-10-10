/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Activity {
    
    public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
		
		double[] grades = new double[5];
		
		String[] subjects = {"Math", "Science", "English", "History", "Programming"};

		System.out.println("Please enter the grades of the following subjects: ");
		
		for (int i = 0; i < subjects.length; i++) {
			//System.out.print(subjects[i] + " : ");
			//grades[i] = sc.nextDouble();
			double grade;
			do {
				System.out.print(subjects[i] + " : ");
				while (!sc.hasNextDouble()) {
					System.out.println("Invalid Input!");
					sc.next();
				}
				
				grade = sc.nextDouble();
				if (grade < 0 || grade > 100) {
						System.out.println("Invalid grade");
				}
			}
			while (grade < 0 || grade > 100);
			grades[i] = grade;
		}
		System.out.println("\nGrades of the subject:");
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " : " + grades[i]);
			
		}
		
		int ttlgrd = 0;
		
		for (int i = 0; i < subjects.length; i++) {
			ttlgrd += grades[i];
			
		}
		
		double ave = (double)ttlgrd / subjects.length;
		
		System.out.println("The average grade is: " + ave);
		
		System.out.println("\nGrade Classification: ");
		
		for (int i = 0; i < grades.length; i++) {
			char gradesClassification;
			if (grades[i] >= 90) {
				gradesClassification = 'A';
			}
			else if (grades[i] >= 80) {
				gradesClassification = 'B';
			}
			else if (grades[i] >= 70) {
				gradesClassification = 'C';
			}
			else if (grades[i] >= 60) {
				gradesClassification = 'D';
			}
			else {
				gradesClassification = 'F';
			}
			System.out.println(subjects[i] + ":" +  grades[i] + "->" + gradesClassification);
		}
                        System.out.println("\nSubjects with grades below 75");
                        for (int i = 0; i < subjects.length; i++){
                            if(grades[i] < 75){
                               System.out.println(subjects[i] + " : " + grades[i]);
                            }
                        }
                        
                        double maxGrade = grades[0];
                        double minGrade = grades[0];
                        String maxSubject = subjects[0];
                        String minSubject = subjects[0];
                        
                        for (int i = 1; i < grades.length; i++) {
                            if (grades[i] > maxGrade){
                                maxGrade = grades[i];
                                maxSubject = subjects[i];
                            }
                            
                        }
                        System.out.println("\nHighest grade: " + maxSubject + " : " + maxGrade);
		
                        for (int i = 1; i < grades.length; i++) {
                            if (grades[i] < minGrade){
                                minGrade = grades[i];
                                minSubject = subjects[i];
                            }
                        }
                            System.out.print("\nLowest grade: " + minSubject + " : " + minGrade);
		sc.close();
    }
    }

