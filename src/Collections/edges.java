package Collections;

public class edges implements Comparable<edges> {
    String vertices;
    Integer weight;

    public edges (String vertices,Integer weight)
    {
       this.vertices= vertices;
       this.weight=weight;

    }

    public Integer getWeight() {
        return weight;
    }

    public String getVertices() {
        return vertices;
    }

    public void setVertices(String vertices) {
        this.vertices = vertices;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
            return "Person: " + this.vertices + ":" + this.weight;
    }

    @Override
    public int compareTo(edges otheredges) {
        return  Integer.compare(weight,otheredges.getWeight());
    }

}
