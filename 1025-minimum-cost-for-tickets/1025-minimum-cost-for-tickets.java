class Solution {
     HashMap<Integer, Integer> hm = new HashMap<>();

    private int help(List<Integer> days, int[] costs, int pos, int reachability) {
        if (pos > days.size() - 1) return 0;
        if (reachability >= days.get(pos)) return help(days, costs, pos + 1, reachability);
        if (hm.containsKey(pos)) return hm.get(pos);

        int day = costs[0] + help(days, costs, pos + 1, days.get(pos));
        int week = costs[1] + help(days, costs, pos + 1, days.get(pos) + 6);
        int month = costs[2] + help(days, costs, pos + 1, days.get(pos) + 29);

        int result = Math.min(day, Math.min(week, month));
        hm.put(pos, result);
        return result;
    }

    public int mincostTickets(int[] day, int[] costs) {
        List<Integer>days=new ArrayList<>();
        for(int i:day)days.add(i);
        return Math.min(
            costs[0] + help(days, costs, 0, days.get(0)),
            Math.min(
                costs[1] + help(days, costs, 0, days.get(0) + 6),
                costs[2] + help(days, costs, 0, days.get(0) + 29)
            )
        );
    }
}