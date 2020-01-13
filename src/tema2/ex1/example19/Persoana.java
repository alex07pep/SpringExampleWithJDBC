package tema2.ex1.example19;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Persoana {
    private String nume;

    @Resource(name="job1")
    private Job job;

    public Persoana(){}
    public String getNume()
    {
        return nume;
    }
    public void setNume(String nume)
    {
        this.nume= nume;
    }
    public Job getJob()
    {
        return job;
    }
    public void setJob(Job job)
    {
        this.job= job;
    }
    public String toString()
    {
        return nume+", "+job;
    }
    @PostConstruct
    public void init()
    {
        System.out.println("init()");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy()");
    }
}
