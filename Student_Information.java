/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academicrecordmaintenancesystem;

/**
 *
 * @author Lerum
 */
public class Student_Information {
    
    private int id;
    private String name, surname, gender, email, phone, username, pass, module_1, mark_1, module_2, mark_2;
    
    
    public Student_Information(int id, String name, String surname, String gender, String email, String phone, String username, String pass, String module_1, String mark_1, String module_2, String mark_2) {
        
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.pass = pass;
        this.module_1 = module_1;
        this.mark_1 = mark_1;
        this.module_2 = module_2;
        this.mark_2 = mark_2;
        
    }
    
    public int getid() {
        
        return id;
        
    }
    
    public String getname() {
        
        return name;
        
    }
    
    public String getsurname() {
        
        return surname;
        
    }
    
    public String getgender() {
        
        return gender;
        
    }
    
    public String getemail() {
        
        return email;
        
    }
    
    public String getphone() {
        
        return phone;
        
    }
    
    public String getusername() {
        
        return username;
        
    }
    
    public String getpass() {
        
        return pass;
        
    }
    
    public String getmodule_1() {
        
        return module_1;
        
    }
    
    public String getmark_1() {
        
        return mark_1;
        
    }
    
    public String getmodule_2() {
        
        return module_2;
        
    }
    
    public String getmark_2() {
        
        return mark_2;
        
    }
}
