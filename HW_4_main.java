public class HW_4_main {
    public static void main(String[] args){
        HW_4_tree tree = new HW_4_tree();
        
        tree.add(12);
        tree.add(6);
        tree.add(2);
        tree.add(8);
        tree.add(9);
        tree.add(10);

        System.out.println("обход дерева в глубину: ");
        tree.dfs();

        //tree.contains(8);

        System.out.println("первый элемент: ");
        tree.findFirst();

        System.out.println("удаление элемента: ");
        tree.dfs();
        tree.remove(10);
        tree.dfs();

        System.out.println("обход дерева в ширину: ");
        tree.bfs();
        
    }
}
