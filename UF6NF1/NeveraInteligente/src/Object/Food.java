/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author Raul
 */
public class Food {
    private  int id;
    private String name;
    private String food_type;
    private int num;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(int id, String name, String food_type, int num) {
        this.id = id;
        this.name = name;
        this.food_type = food_type;
        this.num = num;
    }

    public Food(String name, int num) {
        this.name = name;
        this.num = num;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num < 0) {
            this.num = 0;
        }else{
            this.num = num;
        }     
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        StringBuilder mostrar = new StringBuilder();
        
        mostrar.append(" Alimento -> ").append(name);
        mostrar.append(" \t");
        mostrar.append(" Cantidad ->").append(num);
        mostrar.append(" \t ");
        mostrar.append(" Tipo ->").append(food_type);
        return mostrar.toString();
    }
    
    
}
