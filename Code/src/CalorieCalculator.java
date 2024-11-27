import java.util.Scanner;

public class CalorieCalculator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // User for info
        System.out.println("Calculadora de Calorias:");
        System.out.println();
        
        System.out.print("Genero: (M/F)");
        String gender = scanner.nextLine();
        
        System.out.print("Coloque sua idade: ");
        int age = scanner.nextInt();
        
        System.out.print("Seu peso em kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Sua altura em centímetros: ");
        double height = scanner.nextDouble();
        
        System.out.print("Nível de Atividade (sedentário/moderado/ativo): ");
        String activityLevel = scanner.next();

        // Calculate TMB
        double bmr;
        if (gender.equalsIgnoreCase("M")) {
            bmr = Math.round(88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
        } else if (gender.equalsIgnoreCase("F")) {
            bmr = Math.round(447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
        } else {
            System.out.println("Entrada de gênero inválida.");
            return;
        }

        // Calculate daily calorie needs
        double calorieNeeds;
        switch (activityLevel.toLowerCase()) {
            case "sedentário":
                calorieNeeds = Math.round(bmr * 1.2);
                break;
            case "moderado":
                calorieNeeds = Math.round(bmr * 1.55);
                break;
            case "ativo":
                calorieNeeds = Math.round(bmr * 1.725);
                break;
            default:
                System.out.println("Nível de atividade inválida.");
                return;
        }

        // Display results
        System.out.println();
        System.out.println("Sua Taxa Metabólica Basal (TMB) é: " + (int) bmr + " calorias por dia.");
        
        System.out.println();
        System.out.println("Suas necessidades diárias estimadas são: " + (int) calorieNeeds + " de calorias por dia.");

        scanner.close();
    }
}