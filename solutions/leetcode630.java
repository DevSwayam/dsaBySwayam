class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses , (a,b)-> a[1] == b[1] ? a[0]-b[0] : a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int time = 0;
        for(int[] course: courses){
            // if time required to complete courses is less than last day then continue
            if(course[0] <= course[1]){
                // if past time to complete the courses + current durstion is less than last day of current course
                if(time + course[0]  <= course[1]){
                    pq.offer(course[0]); // then add it in priority queue
                    time+= course[0]; // update the course timing 
                }// if we dont cant finish course before last day then check that can we add new course by removing the past largest time taking 
                 else{
                    if(pq.peek() > course[0]){
                        time -=pq.poll(); // subtract the timing of course which we want to remove 
                        time += course[0]; // add the new one 
                        pq.offer(course[0]); // insert that in priority queue 
                    } 
                }
            }
        }
        return pq.size(); // total length of priority queue will be total number of courses can be finished 
    }
}