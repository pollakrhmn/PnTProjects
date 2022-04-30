import java.util.Scanner;

public class TemperatureImpl implements Temperature {

	public double defaultTemp;
	Scanner input = new Scanner(System.in);

	void hello() {
		System.out.println(
				"----------------Welcome To The------------------\n-------------Temperature Converter--------------");
	}

	void cMode() {

		while (true) {

			System.out.println(
					"\nChoose the Conversion Mode:\nEnter 1 for Celsius ----> Farenheit\nEnter 2 for Farenheit ----> Celsius\n");

			int mode = input.nextInt();

			if (mode == 1) {
				System.out.println("Enter in Celsius\n");

				double celsius = input.nextDouble();

				System.out.println(celsius + " Degrees Celsius ------------> " + getTempInFarenheit(celsius)
						+ " Degrees Farenheit");
			}

			else if (mode == 2) {
				System.out.println("Enter in Farenheit\n");

				double farenheit = input.nextDouble();
				System.out.println(farenheit + " Degrees Farenheit ------------> " + getTempInCelsius(farenheit)
						+ " Degrees Celsius");
			}

			else {

				System.out.print("\nPlease Enter the Correct Conversion Mode!\n");
			}

			System.out.println(
					"\nDo You Want to Continue and Convert Other Temperatures?\nEnter 1 to Continue or 2 to Exit\n");

			int choice = input.nextInt();

			if (choice == 2) {
				System.out.println("\n----------------Goodbye, See You Soon!-----------");
				break;
				

			} else if (choice != 1) {

				System.out.print(
						"\nPlease Enter the Correct Option Next Time,\nWe Will Re-Direct You Back to the Temperature Conversion Mode!\n");

			}

		}
	}

	public double Temperature(double defaultTemp) {
		return this.defaultTemp = defaultTemp;
	}

	@Override
	public double getTempInFarenheit(double celsius) {
		return ((double) ((celsius * 9) / 5 + 32.0));
	}

	@Override
	public double getTempInCelsius(double farenheit) {
		return ((double) ((farenheit - 32.0) * 5 / 9));
	}

	@Override
	public double getCurrentTemp() {
		return defaultTemp;
	}

	@Override
	public double setDefaultTemp(double defaultCelcius) {
		return this.defaultTemp = defaultCelcius;
	}

}
