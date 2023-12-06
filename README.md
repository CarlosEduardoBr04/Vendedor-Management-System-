# Vendedor Management System 📊💼

## Project Overview 🌐

Explore the Vendedor Management System in Java, comprising the `Vendedor` class and the entry point `Principal` class. This system enables user interaction to input the seller's name, base salary, and calculate commissions based on the sales amount.

## `Vendedor` Class 🤝

### Key Features:

- **Attributes:**
  - `Nome`, `salarioBase`, `valorVendido`, `novoSalario`: Store information about the seller.

- **Constructors:**
  1. `public Vendedor()`: Initializes a default `Vendedor` object.
  2. `public Vendedor(String Nome, double salarioBase, double valorVendido, double novoSalario)`: Creates a `Vendedor` with specific values.

- **Methods:**
  1. `CalculoComissao(double valorVendido)`: Calculates the seller's commission as 10% of the sales amount plus the base salary. Updates the `novoSalario` attribute and returns the base salary.
  2. `entrarNome()`: Captures input via `JOptionPane` to register the seller's name.
  3. `EntrarsalarioBase()`: Captures input via `JOptionPane` to register the seller's base salary.

## `Principal` Class Operation 🚀

### Main Method:

- `main(String[] args)`: Entry point of the program. Creates an instance of the `Vendedor` class (`vend`) and orchestrates an interactive menu for entering name, base salary, and calculating commissions.

## User Interaction 🤖

1. **Option 1 (Enter Name):**
   - Invokes the `entrarNome()` method to input the seller's name.

2. **Option 2 (Enter Base Salary):**
   - Invokes the `EntrarsalarioBase()` method to input the seller's base salary.

3. **Option 3 (Calculate Commission):**
   - Prompts the user for the sales amount using `JOptionPane`.
   - Calls the `CalculoComissao(valorVendido)` method to calculate the commission and displays the result.

4. **Option 0 (Exit):**
   - Concludes the program with a closing message.

5. **Invalid Option:**
   - Displays a message if the chosen option is invalid.

## Author 👨‍💻

- [CarlosEduardoBr04](https://github.com/CarlosEduardoBr04) 🚀

## Usage and Contribution 🤝

1. **Clone the Repository:**
   - Begin by cloning the repository.

2. **Explore and Execute:**
   - Incorporate the classes into your Java project and run the `Principal` class to interact with the Vendedor Management System.

3. **Contribute:**
   - Enhance your Java skills by contributing to this project. Suggestions and improvements are encouraged.

## License 📜

This project operates under the MIT License. Refer to the [LICENSE](LICENSE) file for detailed information.

---

Dive into the Vendedor Management System—your gateway to efficient seller information management. Elevate your Java skills while effortlessly handling sales commissions. 💼📊🚀
