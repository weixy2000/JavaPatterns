package iterator;

/**
 *	迭代子模式(Iterator)：迭代子模式可以顺序访问一个聚集中的元素而不必暴露聚集的内部表象。
 *				多个对象聚在一起形成的总体称之为聚集，聚集对象是能够包容一组对象的容器对象。
 *				迭代子模式将迭代逻辑封装到一个独立的子对象中，从而与聚集本身隔开。迭代子模式简化了聚集的界面。
 *				每一个聚集对象都可以有一个或一个以上的迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。
 *				迭代算法可以独立于聚集角色变化。  
 */
public class Test  {
    public static void main(String[] args) {
        String fileName = "d:\\JavaProject\\Iterator\\src\\data.txt";
        DataVector dataVector = new DataVector(fileName);
        Iterator iVector = dataVector.CreateIterator();
        for(iVector.First(); ! iVector.IsDone(); iVector.Next()) {
            iVector.CurrentItem();
        }
    }
}