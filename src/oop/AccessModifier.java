package oop;
/*
Code Breakdown
publicMessage: Read directly by the main method from an outside context.
protectedMessage: Read directly by the ExtendedData class because it inherits from ProtectedData.
defaultMessage: Lacks a keyword. Read directly here because all code resides in the same system file space.
privateMessage: Hidden from main. It can only be read through the public utility method revealSecret().
 */


// Main outer class representing the global scope
public class AccessModifier {

    // 1. PUBLIC: Accessible from absolutely anywhere
    public static class PublicLogger {
        public String publicMessage = "PUBLIC: Accessible everywhere.";

        public void display() {
            System.out.println(publicMessage);
        }
    }

    // 2. PROTECTED: Accessible here, and to any subclass that extends it
    public static class ProtectedData {
        protected String protectedMessage = "PROTECTED: Accessible to package and subclasses.";
    }

    // Subclass demonstrating protected inheritance access
    public static class ExtendedData extends ProtectedData {
        public void showInheritedData() {
            // Works because ExtendedData inherits protected fields from ProtectedData
            System.out.println(protectedMessage);
        }
    }

    // 3. DEFAULT (No modifier): Accessible only within this file/package boundary
    static class DefaultHelper {
        String defaultMessage = "DEFAULT: Accessible only within the same package.";
    }

    // 4. PRIVATE: Strictly locked down to its own enclosing class container
    public static class PrivateVault {
        private String privateMessage = "PRIVATE: Secret data. Only visible inside PrivateVault.";

        public void revealSecret() {
            // Works: Accessing private field from within the same class
            System.out.println(privateMessage);
        }
    }

    // Execution driver method
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Java Access Modifiers ---\n");

        // Testing Public Modifier
        PublicLogger logger = new PublicLogger();
        System.out.println(logger.publicMessage); // Direct access allowed

        // Testing Protected Modifier
        ExtendedData childObj = new ExtendedData();
        childObj.showInheritedData(); // Access via inheritance mapping

        // Testing Default Modifier
        DefaultHelper defaultObj = new DefaultHelper();
        System.out.println(defaultObj.defaultMessage); // Direct package-level access allowed

        // Testing Private Modifier
        PrivateVault vault = new PrivateVault();
        vault.revealSecret(); // Allowed: Asking the class to read its own private data

        // CRITICAL PRIVATE RULE DEMONSTRATION:
        // Un-commenting the line below will throw a Java compilation error:
        // System.out.println(vault.privateMessage);
    }
}
