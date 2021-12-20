/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Asset;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class AssetDirectory {
    private ArrayList<Asset> assetList = new ArrayList<Asset>();

    public ArrayList<Asset> getAssetList() {
        return assetList;
    }

    public void setAssetList(ArrayList<Asset> assetList) {
        this.assetList = assetList;
    }
    
    public Asset fetchAsset(String AssetNo) {
        for (Asset asset : assetList) {
            if (asset.getAssetID().equalsIgnoreCase(AssetNo)) {
                return asset;
            }
        }
        return null;
    }
    
    public void removeAsset(Asset asset) {
        assetList.remove(asset);
    }
    
    public Asset searchAssetName(String AssetName) {
        for (Asset asset : assetList) {
            if (asset.getAssetName().equalsIgnoreCase(AssetName)) {
                return asset;
            }
        }
        return null;
    }
    
    public void addAsset(Asset asset) {
        assetList.add(asset);
    }
    
    public String createAssetID() {
        return "Asset" + (assetList.size() + 1);
    }
    
}
