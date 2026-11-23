import java.util.Scanner;

private static final String CMD_INSTALL = "install";
private static final String CMD_ADD = "add";
private static final String CMD_REGISTER = "register";
private static final String CMD_PICKUP = "pickup";
private static final String CMD_RETURN = "return";
private static final String CMD_STATION = "station";
private static final String CMD_PAY = "pay";
private static final String CMD_TOP = "top";
private static final String CMD_EXIT = "exit";
private static final String MSG_INVALID_COMMAND = "Invalid command";
private static final String MSG_EXIT = "Application exited";
private static final String MSG_NO_TRIPS = "No trips registered";


void main () {
    Scanner in = new Scanner(System.in);
    String cmd = in.nextLine();
    while (!cmd.equals(CMD_EXIT)) {
        processCmd();
    }
}

private static void processCmd(Scanner in, String cmd) {
    switch (cmd) {
        case CMD_INSTALL -> processInstall(in, system);
        case CMD_ADD -> processAdd(in, system);
        case CMD_REGISTER -> processRegister(in,system);
        case CMD_PICKUP -> processPickup(in,system);
        case CMD_RETURN -> processReturn(in,system);
        case CMD_STATION -> processStation(in,system);
        case CMD_PAY -> processPay(in,system);
        case CMD_TOP -> processTop(in,system);
        default -> {
            in.nextLine();
            System.out.println(MSG_INVALID_COMMAND);
        }
    }
}

private static void processInstall (Scanner in, giraSystem system) {
    String stationName = in.nextLine();
    int capacity = in.nextInt();


}