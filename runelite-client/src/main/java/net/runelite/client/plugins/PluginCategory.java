package net.runelite.client.plugins;

public enum PluginCategory
{
	ALL("All"),
	COMBAT("Combat"),
	SKILLS("Skills"),
	UTILITY("Utility"),
	CLIENT("Client");

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
