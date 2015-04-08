import javax.swing.JOptionPane;
public class CarDriver {
	public static void main(String [] args) {
		String customColor, customType, customHorsePower, customEngineSize;
		double engineSize, horsePower;
		
		 Car customCar = new Car();
		JOptionPane.showMessageDialog(null, "Enter the following components required to customize your car.");
		customColor = JOptionPane.showInputDialog("Enter color of car.");
		customType = JOptionPane.showInputDialog("Enter type of car.");
		customHorsePower = JOptionPane.showInputDialog("Enter preferred horse power.");
		horsePower = Double.parseDouble(customHorsePower);
		customEngineSize = JOptionPane.showInputDialog("Enter preferred engine size.");
		engineSize = Double.parseDouble(customEngineSize);
		
		//JOptionPane.showMessageDialog(null, "Customized Car" + "\n" +"Car type: " + customType + "\n" + "Color: " + customColor + "\n" + "Horse Power: " + horsePower + "HP" + "\n" + "Engine Size: " + engineSize + "L");
		customCar.setColor(customColor);
		customCar.setEngineSize(engineSize);
		customCar.setHorsePower(horsePower);
		customCar.setMake(customType);
		
		JOptionPane.showMessageDialog(null, customCar);
		
		Car myCar1 = new Car();
		myCar1.setColor("Black");
		myCar1.setEngineSize(154);
		myCar1.setHorsePower(2);
		myCar1.setMake("Toyota");
		
		JOptionPane.showMessageDialog(null, myCar1);
		
		Car myCar2 = new Car();
		myCar2.setColor("Red");
		myCar2.setEngineSize(154);
		myCar2.setHorsePower(2);
		myCar2.setMake("Chevy");
		
		JOptionPane.showMessageDialog(null, myCar2);
		
		Car myCar3 = new Car();
		myCar3.setColor("White and Black");
		myCar3.setEngineSize(154);
		myCar3.setHorsePower(2);
		myCar3.setMake("Nissan");
		
		JOptionPane.showMessageDialog(null, myCar3);
		
		Car myCar4 = new Car();
		myCar4.setColor(customColor);
		myCar4.setEngineSize(engineSize);
		myCar4.setHorsePower(horsePower);
		myCar4.setMake(customType);
		
		JOptionPane.showMessageDialog(null, myCar4);
		
		JOptionPane.showMessageDialog(null, "Compare custom car and my car : " + customCar.equals(myCar4));
		
		
		
		
			
			
		
		
		