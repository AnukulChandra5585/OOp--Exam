public class Department {
    private String  departmentName;
    private int deptcode ;
    private String fuculty;
    public void setValue(String dn,int dc,String f){
        this.departmentName = dn;
        this.deptcode=dc;
        this.fuculty=f;

    }
    public void display(){
        System.out.println(departmentName);
        System.out.println(deptcode);
        System.out.println(fuculty);
    }

    public static void main(String[] args) {
        Department dept = new Department();
        dept.setValue("cse",21,"fsit");
        dept.display();
    }

}
