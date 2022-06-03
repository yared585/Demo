package com.cognizat.calculator;

class SimpleIntersetCalculator {

	double principalAmount;
	int numberOfYears;

	SimpleIntersetCalculator(double principalAmount, int numberOfYears) {

		this.principalAmount = principalAmount;
		this.numberOfYears = numberOfYears;
	}

	void calculateSimplInterest() {

		double SimpleInterest = 0.0;

		if (principalAmount > 100000) {

			if (numberOfYears > 10) {

				SimpleInterest = (principalAmount * numberOfYears * 10) / 100;

				System.out.println("The interest Amount for a Principal of " + principalAmount + " and years "
						+ numberOfYears + " is " + SimpleInterest);

			} else if (numberOfYears < 10) {

				SimpleInterest = (principalAmount * numberOfYears * 9.5) / 100;
				System.out.println("The interest Amount for a Principal of " + principalAmount + " and years "
						+ numberOfYears + " is " + SimpleInterest);
			}

		} else if (principalAmount < 100000) {
			if (numberOfYears > 10) {

				SimpleInterest = (principalAmount * numberOfYears * 5) / 100;
				System.out.println("The interest Amount for a Principal of " + principalAmount + " and years "
						+ numberOfYears + " is " + SimpleInterest);

			} else if (numberOfYears < 10) {

				SimpleInterest = (principalAmount * numberOfYears * 4.5) / 100;
				System.out.println("The interest Amount for a Principal of " + principalAmount + " and years "
						+ numberOfYears + " is " + SimpleInterest);
			}

		}

	}

}

public class Manager07 {

	public static void main(String[] args) {

		SimpleIntersetCalculator interest1 = new SimpleIntersetCalculator(50000, 5);
		
		interest1.calculateSimplInterest();

	}

}
