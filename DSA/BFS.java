package DSA;
/*

class BFS{
    
    // BFS template 

    int BFS(Node root, Node target) {
    Queue<Node> queue; // Store nodes waiting to be processed

    int step = 0; // Number of steps from the root node to the current node

    // Initialize: add the root node to the queue to begin the BFS
    add root to queue;

    // BFS loop: Continue processing until the queue is empty
    while (queue is not empty) {
        // Get the number of nodes at the current level
        int size = queue.size();

        // Process each node at the current level
        for (int i = 0; i < size; i++) {
            // Retrieve the first node in the queue
            Node cur = the first node in queue;

            // Check if the current node is the target node
            if (cur == target) {
                return step; // Return the step count as the shortest path length
            }

            // Enqueue all neighbors of the current node for processing in the next level
            for (Node next : the neighbors of cur) {
                add next to queue;
            }
            
            // Remove the processed node from the queue
            remove the first node from queue;
        }

        // After processing the current level, increment the step counter
        step = step + 1;
    }

    // If the target node is not reachable, return -1
    return -1;
}





template 2 that uses the visited set, if there is a cycle in the tree



int BFS(Node root, Node target) {
    Queue<Node> queue; // Store nodes waiting to be processed
    Set<Node> visited; // Track visited nodes to prevent revisiting the same node
    int step = 0; // Number of steps from the root node to the current node

    // Initialize: add the root node to the queue and mark it as visited
    add root to queue;
    add root to visited;

    // BFS loop: Continue processing until the queue is empty
    while (queue is not empty) {
        // Get the number of nodes at the current level
        int size = queue.size();

        // Process each node at the current level
        for (int i = 0; i < size; i++) {
            // Retrieve the first node in the queue
            Node cur = the first node in queue;

            // Check if the current node is the target node
            if (cur == target) {
                return step; // Return the current step count as the shortest path length
            }

            // Process all neighbors of the current node
            for (Node next : the neighbors of cur) {
                // If the neighbor has not been visited yet, enqueue and mark it as visited
                if (next is not in visited) {
                    add next to queue;
                    add next to visited;
                }
            }

            // Remove the processed node from the queue
            remove the first node from queue;
        }

        // Increment the step counter after processing the current level
        step = step + 1;
    }

    // Return -1 if the target node is not reachable from the root node
    return -1;
}


}
*/





