package net.runelite.client.plugins;

public enum PluginCategory
{
	ALL("All"),
	COMBAT("Combat"),
	SKILLING("Skilling"),
	UTILITY("Utility"),
	OTHER("Other");

	private final String category;

	PluginCategory(final String category)
	{
		this.category = category;
	}

	@Override
	public String toString()
	{
		return category;
	}
}
