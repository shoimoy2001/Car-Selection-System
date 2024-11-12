package Srscarcompany;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] a) {
        JOptionPane.showMessageDialog(null, "Welcome To SRS automobiles Inc. (SRS)");

        while (true) {
            String category = "";
            String model = "";
            Car selectedCar = null;

            // Loop to repeat asking for a valid category
            while (true) {
                category = JOptionPane.showInputDialog("Choose a category: SUV, Sedan, OffRoad");

                if (category == null) {
                    JOptionPane.showMessageDialog(null, "No category selected, Exiting Program");
                    System.exit(0);
                }


                // Check if the entered category is valid
                if (category.equalsIgnoreCase("suv") || category.equalsIgnoreCase("sedan") || category.equalsIgnoreCase("offroad")) {
                    break; // Exit the loop if a valid category is entered
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Category. Please choose SUV, Sedan, or OffRoad.");
                }
            }


            // Loop to repeat asking for a valid model until found
            while (true) {
                model = JOptionPane.showInputDialog("Enter model >> (X1, I1, Z1)");

                if (model == null ) {
                    JOptionPane.showMessageDialog(null, "No model found, Exiting Program");
                    System.exit(0);
                }



                // Get the model based on the category
                switch (category.toLowerCase()) {
                    case "suv":
                        selectedCar = SUV.getmodel(model);
                        break;
                    case "sedan":
                        selectedCar = Sedan.getmodel(model);
                        break;
                    case "offroad":
                        selectedCar = OffRoad.getmodel(model);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unexpected error: Invalid category.");
                        System.exit(0);
                }

                // If a valid model is found, break the loop
                if (selectedCar != null) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Model not found. Please try again.");
                }
            }

            // Display the car info
            JOptionPane.showMessageDialog(null, selectedCar.displayInfo());

            // Ask if the user would like to check for other models
            int response = JOptionPane.showConfirmDialog(null, "Would you like to check another model?", "Check Another Model", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for visiting SRS automobiles Inc. Exiting Program.");
                break; // Exit the loop if the user chooses 'No'
            }
        }
    }
}


