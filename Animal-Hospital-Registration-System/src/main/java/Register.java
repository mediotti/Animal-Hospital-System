import java.util.Scanner;


public class Register {

    static void animalFileRegistration(AnimalRecordFile newAnimalRecordFile){
        System.out.println("Agora insira os dados do animal.");
        System.out.println("Tamanho do animal: ");
        System.out.println("(P) Pequeno");
        System.out.println("(M) Médio");
        System.out.println("(G) Grande");
        //newAnimalRecordFile.setAnimalSize(Character.toLowerCase(input.next().charAt(0)));
        Character animalSizeOption = Character.toLowerCase(input.next().charAt(0));
            input.nextLine();
        switch (animalSizeOption) {
            case 'p' -> newAnimalRecordFile.setAnimalSize("Pequeno");
            case 'm' -> newAnimalRecordFile.setAnimalSize("Médio");
            case 'g' -> newAnimalRecordFile.setAnimalSize("Grande");
            default -> {
                System.out.println("Opção errada, selecione uma opcão válida!");
                animalFileRegistration(newAnimalRecordFile);
            }
        }
        System.out.println("Nome do animal: ");
            newAnimalRecordFile.setAnimalName(input.nextLine());
        System.out.println("Idade do animal: ");
            newAnimalRecordFile.setAnimalAge(input.nextLine());
        System.out.println("Espécie do animal: ");
            newAnimalRecordFile.setAnimalSpecies(input.nextLine());
        System.out.println("Raça do animal: ");
            newAnimalRecordFile.setAnimalRace(input.nextLine());
        System.out.println("Sexo do animal: ");
            newAnimalRecordFile.setAnimalGender(Character.toUpperCase(input.next().charAt(0)));
                input.nextLine();
        System.out.println("Diagnóstico do animal: ");
            newAnimalRecordFile.setAnimalDisease(input.nextLine());

        System.out.println(newAnimalRecordFile.toString());

    }

    static void newRecordFileRegistration(){
        AnimalRecordFile newAnimalRecordFile = new AnimalRecordFile();
        System.out.println("Iniciando pelos dados do tutor.");

        System.out.println("Nome do tutor: ");
            newAnimalRecordFile.setOwnerName(input.nextLine());
        System.out.println("Endereço do tutor: ");
            newAnimalRecordFile.setOwnerAddress(input.nextLine());
        System.out.println("CPF do tutor: ");
            newAnimalRecordFile.setOwnerCPF(input.nextLine());
        System.out.println("Telefone do tutor: ");
        newAnimalRecordFile.setOwnerPhoneNumber(input.nextLine());

        animalFileRegistration(newAnimalRecordFile);
        }
    static void menuNewRecordFile() {
        System.out.println("Deseja inserir uma nova ficha de registro?");
        System.out.println("(S) Sim");
        System.out.println("(N) Não");
        Character option = Character.toLowerCase(input.next().charAt(0));
            input.nextLine();
        switch (option) {
            case 's' -> newRecordFileRegistration();
            case 'n' -> System.out.println("Saindo do menu...");
            default -> {
                System.out.println("Opção errada! Selecione uma opção correta.");
                menuNewRecordFile();
            }
        }
    }
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menuNewRecordFile();
    }
}
