package proxy;

public class Citizen {

  private String problem;
  private String job;

  public String tellTheRequest(){
    return problem;
  }

  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public String askANewJob(){
    return job;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}
