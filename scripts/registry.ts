import { AddonUtils, GuideBookComponent } from "@lpsmods/mc-utils";
import { BlockComponentRegistry, ItemComponentRegistry } from "@minecraft/server";
import { pages } from "./guide/main";

export function registerItemComponents(registry: ItemComponentRegistry): void {
  registry.registerCustomComponent(AddonUtils.makeId("guide_book"), new GuideBookComponent(pages));
}

export function registerBlockComponents(registry: BlockComponentRegistry): void {}
