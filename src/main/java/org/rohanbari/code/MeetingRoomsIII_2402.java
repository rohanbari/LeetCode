package org.rohanbari.code;

import java.util.Arrays;
import java.util.PriorityQueue;

class MeetingRoomsIII_2402 {
    
    public static int mostBooked(int n, int[][] meetings) {
        // Sorting based on the start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        PriorityQueue<long[]> queue = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? (int) (a[1] - b[1]) : (int) (a[0] - b[0]));

        // Number of meetings in rooms
        int[] roomCount = new int[n];
        int result = 0;

        // Initializing each room with start time 0
        for (int i = 0; i < n; i++)
            queue.add(new long[] { 0, i });

        for (int[] meeting : meetings) {
            // Start time of the new meeting
            int startTime = meeting[0];

            // Adding start time as the first and current room as the second
            // element in the array
            while (queue.peek()[0] < startTime)
                queue.add(new long[] { startTime, queue.poll()[1] });

            long[] current = queue.poll();
            int currentRoom = (int) current[1];

            long endTime = current[0] + (meeting[1] - meeting[0]);
            roomCount[currentRoom]++;

            if (roomCount[currentRoom] > roomCount[result])
                result = currentRoom;
            else if (roomCount[currentRoom] == roomCount[result])
                result = Math.min(result, currentRoom);

            queue.add(new long[] { endTime, currentRoom });
        }

        return result;
    }
}
