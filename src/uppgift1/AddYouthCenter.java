package uppgift1;

import javax.swing.*;


public class AddYouthCenter {
    //ligger här för att jag vill inte att en ny arraylist skapas varje gång metoden under körs
    //lila betyder att det är en klassvariabel
    FileManager fileManager = new FileManager();


    public void addPropertiesNewYouthCenter(){
        String name = JOptionPane.showInputDialog("Enter name");
        String address = JOptionPane.showInputDialog("Enter address");
        String email = JOptionPane.showInputDialog("Enter email");
        String headOfDepartment = JOptionPane.showInputDialog("Enter head of Department");
        String userName = JOptionPane.showInputDialog("Enter Username");
        String passWord = JOptionPane.showInputDialog("Enter password");


        YouthCenter youthCenter = new YouthCenter(name, address, email, headOfDepartment, userName, passWord );
        String path = "youthcenter";
        String user = name;
        String[] send = {String.valueOf(youthCenter),path, name};
        //gjorde att denna metod skickar med en array till readTo Object så att
        // te apply kan anvnda samma metod sen med . 
        fileManager.readObjectToFile(send);
        FeedbackYouthCenterIsCreated(youthCenter);
}

public void FeedbackYouthCenterIsCreated(YouthCenter center){

        YouthCenter youthCenter = center;

   JOptionPane.showMessageDialog(null,
           "You have created a new Youthcenter with " +
            "\n Name: "+youthCenter.getName()+
            "\n Address: "+youthCenter.getAddress()+
                   "\n Email: " +youthCenter.getEmail()+
           "\n Head of department: "+youthCenter.getHeadOfDepartment()+
           "\n Username: "+youthCenter.getUserName()+
           "\n Password: "+youthCenter.getPassWord());
}


}
