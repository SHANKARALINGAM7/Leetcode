class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
         Set<String> avl = new HashSet<>();
        Map<String, Integer> rec = new HashMap<>();
        Map<String, List<String>> adj = new HashMap<>();
        for (String str : supplies) {
            avl.add(str);
        }

        for (int i = 0; i < recipes.length; i++) {
            rec.put(recipes[i], i);
        }

        int[] inDegree = new int[recipes.length];

        for (int recipei = 0; recipei < recipes.length; recipei++) {
            for (String ingredient : ingredients.get(recipei)) {
                if (!avl.contains(ingredient)) {
                    adj.putIfAbsent(
                        ingredient,
                        new ArrayList<String>()
                    );
                    adj.get(ingredient).add(recipes[recipei]);
                    inDegree[recipei]++;
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int recipei = 0; recipei < recipes.length; recipei++) {
            if (inDegree[recipei] == 0) {
                queue.add(recipei);
            }
        }

        List<String> createdRecipes = new ArrayList<>();
        while (!queue.isEmpty()) {
            int recipei = queue.poll();
            String recipe = recipes[recipei];
            createdRecipes.add(recipe);

            if (!adj.containsKey(recipe)) continue;

            for (String dependentRecipe : adj.get(recipe)) {
                if (--inDegree[rec.get(dependentRecipe)] == 0) {
                    queue.add(rec.get(dependentRecipe));
                }
            }
        }

        return createdRecipes;
    }
}